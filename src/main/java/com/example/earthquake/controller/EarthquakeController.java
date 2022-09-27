package com.example.earthquake.controller;

import com.example.earthquake.model.Earthquake;
import com.example.earthquake.utility.LatLng;
import com.example.earthquake.utility.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
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
    @RequestMapping("/list")
    private String listEarthquakes(Model model) throws IOException, InterruptedException, JSONException {
        earthquakeList = loadDataToList(360, "Turkey");
        model.addAttribute("earthquakes", earthquakeList);

        return "earthquake-list";
    }

    private List<Earthquake> loadDataToList(int pastDaysCount, String country) throws IOException, InterruptedException, JSONException {
        String endDate = LocalDate.now().toString();
        String startDate = LocalDate.now().minusDays(pastDaysCount).toString();
        LatLng latLng = Util.COUNTRIES_LAT_LON.get(country);
        double minLat = latLng.getLatitude() - 30.0;
        double maxLat = latLng.getLatitude() + 30.0;
        double minLon = latLng.getLongitude() - 80.0;
        double maxLon = latLng.getLongitude() + 80.0;

        if(minLat < -90 || maxLat > 90){
            minLat = latLng.getLatitude() - 14.0;
            maxLat = latLng.getLatitude() + 14.0;
        }

        List <Earthquake> tempList = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("Content-Type", "application/json")
                .uri(URI.create(API_URL + "starttime="+startDate+"&endtime="+endDate+"&minlatitude="+minLat+"&maxlatitude="+maxLat+"&minlongitude="+minLon+"&maxlongitude="+maxLon))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject jsonObject = new JSONObject(response.body());
        JSONArray jsonArray = jsonObject.getJSONArray("features");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        int id = 1;
        if(jsonArray.length() > 0){
            for(int i=0; i<jsonArray.length(); i++){
                if(jsonArray.getJSONObject(i).getJSONObject("properties").getString("place").contains(country)){
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
        return tempList;
    }
}
