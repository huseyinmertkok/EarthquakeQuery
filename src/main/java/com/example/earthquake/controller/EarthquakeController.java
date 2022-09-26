package com.example.earthquake.controller;

import com.example.earthquake.model.Earthquake;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/earthquake")
public class EarthquakeController {
    private List<Earthquake> earthquakeList;

    private void loadDataToList(String country, int daysPast){
        earthquakeList = new ArrayList<>();
    }

    @RequestMapping("/list")
    private String listEarthquakes(Model model){
        model.addAttribute("earthquakes", earthquakeList);
        return "earthquakes";
    }
}
