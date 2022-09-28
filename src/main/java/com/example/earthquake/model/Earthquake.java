package com.example.earthquake.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Earthquake {
    private int id;
    private String country;
    private String place;
    private Double mag;
    private String time;

    public Earthquake(int id, String country, String place, Double mag, String time){
        this.id = id;
        this.country = country;
        this.place = place;
        this.mag = mag;
        this.time = time;
    }
}
