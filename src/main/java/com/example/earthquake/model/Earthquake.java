package com.example.earthquake.model;

import lombok.Data;

import java.util.Date;

@Data
public class Earthquake {
    private String country;
    private String place;
    private String magnitude;
    //private Date date;

    public Earthquake(String country, String place, String magnitude){
        this.country = country;
        this.place = place;
        this.magnitude = magnitude;
    }
}
