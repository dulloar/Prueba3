package com.davidulloa.examen_2021_05_17.data.local.models;

public class Ubicacion {
    private String id;
    private float lat;
    private float lon;

    public Ubicacion() {
    }

    public Ubicacion(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }
}
