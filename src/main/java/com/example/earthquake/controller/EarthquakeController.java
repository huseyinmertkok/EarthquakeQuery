package com.example.earthquake.controller;

import com.example.earthquake.model.Earthquake;
import com.example.earthquake.service.EarthquakeService;
import com.example.earthquake.utility.LatLng;
import com.example.earthquake.utility.Util;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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
    private final EarthquakeService earthquakeService;
    @Autowired
    public EarthquakeController(EarthquakeService earthquakeService){
        this.earthquakeService = earthquakeService;
    }

    @RequestMapping("/list")
    private String listEarthquakes(Model model, @RequestParam String country, @RequestParam int pastDaysCount){
        return earthquakeService.listEarthquakes(model, country, pastDaysCount);
    }


}
