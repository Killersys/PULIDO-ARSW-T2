package edu.eci.arsw.cache;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class WeatherCache implements IWeatherCache{
	
	HashMap<String, JSONObject> value = new HashMap<String, JSONObject>();
	
	@Override
	public JSONObject returrn(String ciudad) {
		JSONObject json = value.get(ciudad);
		return json;}
	
	@Override
	public boolean verify(String ciudad) {
		return value.containsKey(ciudad);}
	
	@Override
	public void save(JSONObject json, String ciudad) {
		value.put(ciudad, json);}}


