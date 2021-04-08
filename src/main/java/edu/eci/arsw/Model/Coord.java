package edu.eci.arsw.Model;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Coord {
    private float lon;
    private float lat;


    // Getter Methods

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }

    // Setter Methods

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
}
