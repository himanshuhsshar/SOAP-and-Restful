package com.sharekhan.endpoint.test;

import com.upstock.trading.service.StockManager;
import com.upstock.trading.service.StockManagerImplService;
import com.upstock.trading.types.BuyQuote;
import com.upstock.trading.types.Receipt;

public class SharekhanTest {
	public static void main(String[] args) {
		StockManagerImplService service = new StockManagerImplService();
		StockManager stockManager = service.getStockManagerImplPort();

		BuyQuote quote = new BuyQuote();
		quote.setStockName("cipla");
		quote.setQuantity(3);
		quote.setPrice(344);
		
		Receipt receipt = stockManager.buyStock(quote);
		System.out.println("receipt no : " +receipt.getOrderNo());
	}
}
