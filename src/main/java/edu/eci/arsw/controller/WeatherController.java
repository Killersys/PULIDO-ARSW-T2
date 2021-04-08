package edu.eci.arsw.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.arsw.services.WeatherServices;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET})
@RequestMapping("/wea")
public class WeatherController {
	
	@Autowired
	WeatherServices weatherServices;
	
	@GetMapping("/name/{name}")
	public String getWeatherByCityName(@PathVariable ("name") String name) {
		JSONObject json = weatherServices.wea(name);
		String text=json.toString();
		return text;
	}
	
}
