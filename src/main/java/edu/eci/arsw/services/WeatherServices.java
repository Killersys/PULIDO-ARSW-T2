package edu.eci.arsw.services;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.eci.arsw.Api.ExternalAPIimpl;
import edu.eci.arsw.cache.WeatherCache;

@Service
	public class WeatherServices implements IWeatherServices{
		
		@Autowired
		WeatherCache cache;
		@Autowired
		ExternalAPIimpl api;
		
		@Override
		public JSONObject wea(String city) {
			JSONObject json = null;
			if(cache.verify(city)) {
				json=cache.returrn(city);
				return json;
			}else {
				json = api.weaCity(city);
				cache.save(json, city);
			}
			return json;
		}

	}
