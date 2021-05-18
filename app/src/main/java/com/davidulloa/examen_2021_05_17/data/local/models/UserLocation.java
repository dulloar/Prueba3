package com.davidulloa.examen_2021_05_17.data.local.models;

public class UserLocation {
    private String id;
    private double lat;
    private double lon;

    public UserLocation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
