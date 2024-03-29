
package com.upstock.trading.service;

import com.upstock.trading.types.BuyQuote;
import com.upstock.trading.types.ObjectFactory;
import com.upstock.trading.types.Receipt;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;

/**
 * This class was generated by the XML-WS Tools. XML-WS Tools 4.0.0 Generated
 * source version: 3.0
 * 
 */
@WebService(name = "StockManager", targetNamespace = "http://upstock.com/trading/service")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface StockManager {

	/**
	 * 
	 * @param parameters
	 * @return returns com.upstock.trading.types.Receipt
	 */
	@WebMethod(action = "http://upstock.com/trading/service/buyStock")
	@WebResult(name = "receipt", targetNamespace = "http://upstock.com/trading/types", partName = "out")
	@Action(input = "http://upstock.com/trading/service/buyStock", output = "http://upstock.com/trading/service/StockManager/buyStockResponse")
	public Receipt buyStock(
			@WebParam(name = "buyQuote", targetNamespace = "http://upstock.com/trading/types", partName = "parameters") BuyQuote parameters);

}
