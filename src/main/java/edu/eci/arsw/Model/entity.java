package edu.eci.arsw.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class entity implements Serializable {
    Coord CoordObject;
    ArrayList< Object > weather = new ArrayList < Object > ();
    private String base;
    Main MainObject;
    Wind WindObject;
    Clouds CloudsObject;
    Rain RainObject;
    private float dt;
    Sys SysObject;
    private float id;
    private String name;
    private float cod;


    // Getter Methods

    public Coord getCoord() {
        return CoordObject;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return MainObject;
    }

    public Wind getWind() {
        return WindObject;
    }

    public Clouds getClouds() {
        return CloudsObject;
    }

    public Rain getRain() {
        return RainObject;
    }

    public float getDt() {
        return dt;
    }

    public Sys getSys() {
        return SysObject;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCod() {
        return cod;
    }

    // Setter Methods

    public void setCoord(Coord coordObject) {
        this.CoordObject = coordObject;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMain(Main mainObject) {
        this.MainObject = mainObject;
    }

    public void setWind(Wind windObject) {
        this.WindObject = windObject;
    }

    public void setClouds(Clouds cloudsObject) {
        this.CloudsObject = cloudsObject;
    }

    public void setRain(Rain rainObject) {
        this.RainObject = rainObject;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setSys(Sys sysObject) {
        this.SysObject = sysObject;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(float cod) {
        this.cod = cod;
    }
}
