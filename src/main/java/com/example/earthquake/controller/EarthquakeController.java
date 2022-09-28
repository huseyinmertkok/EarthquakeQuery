package com.example.earthquake.controller;
import com.example.earthquake.service.EarthquakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
