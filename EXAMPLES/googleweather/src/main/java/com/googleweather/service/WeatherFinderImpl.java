package com.googleweather.service;

import java.security.SecureRandom;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.googleweather.service.WeatherFinder")
public class WeatherFinderImpl {

	public double getTemperature(int zipCode) {
		SecureRandom secureRandom = new SecureRandom();
		return secureRandom.nextInt(100);
	}

}
