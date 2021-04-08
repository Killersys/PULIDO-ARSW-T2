package edu.eci.arsw.services;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.eci.arsw.Api.ExternalAPIimpl;

@Service
public class WeatherServices implements IWeatherServices{
	
	@Component
	public class WeatherServices implements IweatherServices {
	    @Autowired
	    @Qualifier("WeatherRepository")
	    WeatherRepository weatherRepository;
	    @Override
	    public entity getByName(String name) {
	        System.out.println("soy yo");
	        return weatherRepository.find(name);
	    }
	}