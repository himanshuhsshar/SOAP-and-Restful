
package com.goair.travel.types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengers" type="{http://www.goair.com/travel/types}passenger" maxOccurs="6"/&gt;
 *         &lt;element name="journey-info"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="flight-no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="journey-dt" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="mobile-no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="email-address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "passengers",
    "journeyInfo"
})
@XmlRootElement(name = "travelPlan")
public class TravelPlan {

    @XmlElement(required = true)
    protected List<Passenger> passengers;
    @XmlElement(name = "journey-info", required = true)
    protected TravelPlan.JourneyInfo journeyInfo;

    /**
     * Gets the value of the passengers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passenger }
     * 
     * 
     */
    public List<Passenger> getPassengers() {
        if (passengers == null) {
            passengers = new ArrayList<Passenger>();
        }
        return this.passengers;
    }

    /**
     * Gets the value of the journeyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelPlan.JourneyInfo }
     *     
     */
    public TravelPlan.JourneyInfo getJourneyInfo() {
        return journeyInfo;
    }

    /**
     * Sets the value of the journeyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPlan.JourneyInfo }
     *     
     */
    public void setJourneyInfo(TravelPlan.JourneyInfo value) {
        this.journeyInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="flight-no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="journey-dt" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="mobile-no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="email-address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightNo",
        "source",
        "destination",
        "journeyDt",
        "mobileNo",
        "emailAddress"
    })
    public static class JourneyInfo {

        @XmlElement(name = "flight-no", required = true)
        protected String flightNo;
        @XmlElement(required = true)
        protected String source;
        @XmlElement(required = true)
        protected String destination;
        @XmlElement(name = "journey-dt", required = true)
        @XmlSchemaType(name = "date")
        protected Date journeyDt;
        @XmlElement(name = "mobile-no", required = true)
        protected String mobileNo;
        @XmlElement(name = "email-address", required = true)
        protected String emailAddress;

        /**
         * Gets the value of the flightNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightNo() {
            return flightNo;
        }

        /**
         * Sets the value of the flightNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightNo(String value) {
            this.flightNo = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestination(String value) {
            this.destination = value;
        }

        /**
         * Gets the value of the journeyDt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public Date getJourneyDt() {
            return journeyDt;
        }

        /**
         * Sets the value of the journeyDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJourneyDt(Date value) {
            this.journeyDt = value;
        }

        /**
         * Gets the value of the mobileNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobileNo() {
            return mobileNo;
        }

        /**
         * Sets the value of the mobileNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobileNo(String value) {
            this.mobileNo = value;
        }

        /**
         * Gets the value of the emailAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailAddress() {
            return emailAddress;
        }

        /**
         * Sets the value of the emailAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailAddress(String value) {
            this.emailAddress = value;
        }

    }

}
