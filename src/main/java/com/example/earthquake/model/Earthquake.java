package com.example.earthquake.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Earthquake {
    private String place;
    private Double mag;

    public Earthquake(String place, Double mag){
        this.place = place;
        this.mag = mag;
    }
}
