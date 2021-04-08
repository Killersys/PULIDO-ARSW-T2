package edu.eci.arsw.cache;

import org.json.JSONObject;

public interface IWeatherCache {
	public void save(JSONObject json, String ciudad);
	public boolean verify(String ciudad);
	public JSONObject returrn(String ciudad);
}
