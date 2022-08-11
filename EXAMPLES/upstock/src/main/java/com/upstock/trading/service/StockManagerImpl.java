package com.upstock.trading.service;

import java.util.UUID;

import com.upstock.trading.types.BuyQuote;
import com.upstock.trading.types.Receipt;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.upstock.trading.service.StockManager")
public class StockManagerImpl {

	public Receipt buyStock(BuyQuote buyQuote) {
		Receipt receipt = new Receipt();
		receipt.setOrderNo(UUID.randomUUID().toString().substring(1, 5));
		receipt.setStockName(buyQuote.getStockName());
		receipt.setStatus("pending");
		return receipt;
	}

}
