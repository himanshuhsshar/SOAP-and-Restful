package com.googleweather.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(name = "WeatherFinder", targetNamespace = "http://google.com/weather/service")
public interface WeatherFinder {
	@WebMethod
	@WebResult(name = "temperature", targetNamespace = "http://google.com/weather/types")
	double getTemperature(
			@WebParam(name = "zip-code", targetNamespace = "http://google.com/weather/types") int zipCode);

}
