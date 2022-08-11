package com.sharekhan.endpoint.test;

import com.upstock.trading.service.StockManager;
import com.upstock.trading.service.StockManagerImplService;
import com.upstock.trading.types.BuyQuote;
import com.upstock.trading.types.Receipt;

public class SharekhanTest {

	public static void main(String[] args) {
		StockManagerImplService stockManagerImplService = new StockManagerImplService();
		StockManager stockManager = stockManagerImplService.getStockManagerImplPort();

		BuyQuote buyQuote = new BuyQuote();
		buyQuote.setStockName("cipla");
		buyQuote.setQuantity("3");
		buyQuote.setPrice(344);

		Receipt receipt = stockManager.buyStock(buyQuote);
		System.out.println("Receipt No : " + receipt.getOrderNo());

	}

}
