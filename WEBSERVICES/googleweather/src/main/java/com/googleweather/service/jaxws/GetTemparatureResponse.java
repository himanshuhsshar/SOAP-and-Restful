
package com.googleweather.service.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTemparatureResponse", namespace = "http://google.com/weather/service")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTemparatureResponse", namespace = "http://google.com/weather/service")
public class GetTemparatureResponse {

    @XmlElement(name = "temparature", namespace = "http://google.com/weather/types")
    private double temparature;

    /**
     * 
     * @return
     *     returns double
     */
    public double getTemparature() {
        return this.temparature;
    }

    /**
     * 
     * @param temparature
     *     the value for the temparature property
     */
    public void setTemparature(double temparature) {
        this.temparature = temparature;
    }

}
