package com.googleweather.service;

import java.security.SecureRandom;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.googleweather.service.WeatherFinder")
public class WeatherFinderImpl {

	public double getTemparature(int zipCode) {
		SecureRandom random = new SecureRandom();
		return random.nextInt(100);
	}

}
