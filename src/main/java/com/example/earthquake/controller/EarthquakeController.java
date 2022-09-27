package com.example.earthquake.controller;

import com.example.earthquake.model.Earthquake;
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
        List <Earthquake> tempList = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("Content-Type", "application/json")
                .uri(URI.create(API_URL + "starttime="+startDate+"&endtime="+endDate+"&minlatitude=36&maxlatitude=42&minlongitude=26&maxlongitude=45"))
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
                            jsonArray.getJSONObject(i).getJSONObject("properties").getString("place"),
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
