
package com.googleweather.service.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTemperature", namespace = "http://google.com/weather/service")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTemperature", namespace = "http://google.com/weather/service")
public class GetTemperature {

    @XmlElement(name = "zip-code", namespace = "http://google.com/weather/types")
    private int zipCode;

    /**
     * 
     * @return
     *     returns int
     */
    public int getZipCode() {
        return this.zipCode;
    }

    /**
     * 
     * @param zipCode
     *     the value for the zipCode property
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
