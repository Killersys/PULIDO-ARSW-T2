package edu.eci.arsw.Api;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class ExternalAPIimpl implements IExternalAPI{

	@Override
	public JSONObject weaCity(String name) {
		HttpResponse<String> response= null;
		try {
			response = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+ name +"&appid=332a9b44aa3b26f48c38ccada00e8181").asString();
			return new JSONObject(response.getBody());		} 
		catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		}
		return null;	}}
