package com.example.earthquake.controller;

import com.example.earthquake.model.Earthquake;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/earthquake")
public class EarthquakeController {
    private List<Earthquake> earthquakeList;
    private final String API_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2021-01-01&endtime=2021-01-02";
    private void loadDataToList() throws IOException, InterruptedException, JSONException {
        earthquakeList = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("Content-Type", "application/json")
                .uri(URI.create(API_URL))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject jsonObject = new JSONObject(response.body());
        JSONArray jsonArray = jsonObject.getJSONArray("features");

        for(int i=0; i<jsonArray.length(); i++){
            earthquakeList.add(new Earthquake(
                    jsonArray.getJSONObject(i).getJSONObject("properties").getString("place"),
                    jsonArray.getJSONObject(i).getJSONObject("properties").getDouble("mag")
            ));
        }
    }

    @RequestMapping("/list")
    private String listEarthquakes(Model model) throws IOException, InterruptedException, JSONException {
        loadDataToList();
        model.addAttribute("earthquakes", earthquakeList);
        return "earthquake-list";
    }
}
