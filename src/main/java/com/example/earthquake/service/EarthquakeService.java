package com.example.earthquake.service;

import com.example.earthquake.model.Earthquake;
import com.example.earthquake.utility.Util;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class EarthquakeService {
    private List<Earthquake> earthquakeList;

    public String listEarthquakes(Model model, String country, int pastDaysCount){
        //Insert all the earthquakes related to inputs.
        earthquakeList = Util.loadDataToList(pastDaysCount, country);

        //Check for any error
        if(!Util.control){
            model.addAttribute("text", "Matching events exceeds search limit of 20000. Modify the search to match fewer events.");
            return "error";
        }

        //Check if is there any earthquake
        if(earthquakeList.isEmpty()){
            if(!Util.COUNTRIES_LAT_LON.containsKey(country)){
                model.addAttribute("text", "Country is invalid!");
                return "error";
            }
            if(pastDaysCount <= 0){
                model.addAttribute("text", "Past days count must be greater than 0!");
                return "error";
            }
            model.addAttribute("x", pastDaysCount);
            model.addAttribute("country", country);
            return "empty";
        }

        model.addAttribute("earthquakes", earthquakeList);
        return "earthquake-list";
    }

}
