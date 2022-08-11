package com.saxprocessing.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author himan
 *
 */
public class GetTotalQuantityHandler extends DefaultHandler {

	private int totalQuantity;
	private String elementName;

	@Override
	public void startDocument() throws SAXException {
		totalQuantity = 0;
		elementName = null;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		elementName = qName;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = null;
		if (elementName != null && elementName.equals("quantity")) {
			data = new String(ch, start, length);
			totalQuantity += Integer.parseInt(data);
		}
		elementName = null;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

}
