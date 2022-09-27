package com.example.earthquake.utility;

import lombok.Data;

@Data
public class LatLng {
    private double latitude;
    private double longitude;

    private int maxRadiusKm;


    public LatLng(double latitude, double longitude, int maxRadiusKm) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.maxRadiusKm = maxRadiusKm;
    }
}
