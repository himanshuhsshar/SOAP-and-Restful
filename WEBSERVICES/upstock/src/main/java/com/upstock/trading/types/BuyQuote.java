
package com.upstock.trading.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stockName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stockName",
    "quantity",
    "price"
})
@XmlRootElement(name = "buyQuote")
public class BuyQuote {

    @XmlElement(required = true)
    protected String stockName;
    protected int quantity;
    protected float price;

    /**
     * Gets the value of the stockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Sets the value of the stockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockName(String value) {
        this.stockName = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

}
