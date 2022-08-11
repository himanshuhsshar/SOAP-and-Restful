
package com.upstock.trading.types;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.upstock.trading.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.upstock.trading.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyQuote }
     * 
     * @return
     *     the new instance of {@link BuyQuote }
     */
    public BuyQuote createBuyQuote() {
        return new BuyQuote();
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     * @return
     *     the new instance of {@link Receipt }
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

}