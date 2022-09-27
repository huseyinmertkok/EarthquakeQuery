package com.example.earthquake.controller;

import com.example.earthquake.model.Earthquake;
import com.example.earthquake.utility.LatLng;
import com.example.earthquake.utility.Util;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/earthquake")
public class EarthquakeController {
    private List<Earthquake> earthquakeList;
    private final String API_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&";
    boolean control;
    @RequestMapping("/list")
    private String listEarthquakes(Model model, @RequestParam String country, @RequestParam int pastDaysCount){
        //Insert all the earthquakes related to inputs.
        earthquakeList = loadDataToList(pastDaysCount, country);

        //Check for any error
        if(!control) return "error";

        //Check if is there any earthquake
        if(earthquakeList.isEmpty()){
            model.addAttribute("x", pastDaysCount);
            return "empty";
        }

        model.addAttribute("earthquakes", earthquakeList);
        return "earthquake-list";
    }

    private List<Earthquake> loadDataToList(int pastDaysCount, String country) {
        control = true;

        //This day.
        String endDate = LocalDate.now().toString();

        //This day - past days
        String startDate = LocalDate.now().minusDays(pastDaysCount).toString();

        //Get Latitude and Longitude values from country name
        LatLng latLng = Util.COUNTRIES_LAT_LON.get(country);

        List <Earthquake> tempList = new ArrayList<>();
        try{
            //Creating our request
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .header("Content-Type", "application/json")
                    .uri(URI.create(API_URL + "starttime="+startDate+"&endtime="+endDate+"&latitude="+latLng.getLatitude()+"&longitude="+latLng.getLongitude()+"&maxradiuskm="+latLng.getMaxRadiusKm()))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //Creating a JSON object with json response.
            JSONObject jsonObject = new JSONObject(response.body());
            JSONArray jsonArray = jsonObject.getJSONArray("features");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            int id = 1;
            if(jsonArray.length() > 0){
                for(int i=0; i<jsonArray.length(); i++){
                    //United States is the only country not part of the place value.
                    if(!country.equals("United States")){
                        if(jsonArray.getJSONObject(i).getJSONObject("properties").getString("place").toLowerCase().contains(country.toLowerCase())){
                            tempList.add(new Earthquake(
                                    id,
                                    country,
                                    Util.capitalizeFirstLetter(jsonArray.getJSONObject(i).getJSONObject("properties").getString("place")),
                                    jsonArray.getJSONObject(i).getJSONObject("properties").getDouble("mag"),
                                    simpleDateFormat.format(new Date(jsonArray.getJSONObject(i).getJSONObject("properties").getLong("time")))
                            ));
                            id++;
                        }
                    }else{
                        //But there is States in these value so 'place' has checked for all the states.
                        if(Util.stateControl(jsonArray.getJSONObject(i).getJSONObject("properties").getString("place").toLowerCase())){
                            tempList.add(new Earthquake(
                                    id,
                                    country,
                                    Util.capitalizeFirstLetter(jsonArray.getJSONObject(i).getJSONObject("properties").getString("place")),
                                    jsonArray.getJSONObject(i).getJSONObject("properties").getDouble("mag"),
                                    simpleDateFormat.format(new Date(jsonArray.getJSONObject(i).getJSONObject("properties").getLong("time")))
                            ));
                            id++;
                        }
                    }
                }
            }
        }catch (Exception e){
            control = false;
            e.printStackTrace();
        }

        return tempList;
    }
}
