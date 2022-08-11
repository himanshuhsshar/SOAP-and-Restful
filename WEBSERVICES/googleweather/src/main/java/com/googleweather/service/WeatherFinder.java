package com.googleweather.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(name = "WeatherFinder", targetNamespace = "http://google.com/weather/service")
public interface WeatherFinder {
	@WebMethod
	@WebResult(name = "temparature", targetNamespace = "http://google.com/weather/types")
	double getTemparature(
			@WebParam(name = "zip-code", targetNamespace = "http://google.com/weather/types") int zipCode);
}
