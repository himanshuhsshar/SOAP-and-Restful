
package com.googleweather.service.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTemperatureResponse", namespace = "http://google.com/weather/service")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTemperatureResponse", namespace = "http://google.com/weather/service")
public class GetTemperatureResponse {

    @XmlElement(name = "temperature", namespace = "http://google.com/weather/types")
    private double temperature;

    /**
     * 
     * @return
     *     returns double
     */
    public double getTemperature() {
        return this.temperature;
    }

    /**
     * 
     * @param temperature
     *     the value for the temperature property
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
