package com.saxprocessing.test;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import com.saxprocessing.handler.GetItemCountHandler;
import com.saxprocessing.handler.GetTotalQuantityHandler;
import com.saxprocessing.handler.PrintHandler;

public class SAXProcessingTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema poSchema = schemaFactory.newSchema(new File("D:\\WebServices\\saxprocessing\\src\\main\\resources\\po.xsd"));
		Validator validator = poSchema.newValidator();
		validator.validate(new StreamSource(new File("D:\\WebServices\\saxprocessing\\src\\main\\resources\\po.xml")));
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(new File("D:\\WebServices\\saxprocessing\\src\\main\\resources\\po.xml"), new PrintHandler());
		GetItemCountHandler handler = new GetItemCountHandler(); 
		parser.parse(new File("D:\\WebServices\\saxprocessing\\src\\main\\resources\\po.xml"), handler);
		int count = handler.getNoOfItems();
		System.out.println("No Of Items : " + count);
		GetTotalQuantityHandler getTotalQuantityHandler = new GetTotalQuantityHandler();
		parser.parse(new File("D:\\WebServices\\saxprocessing\\src\\main\\resources\\po.xml"), getTotalQuantityHandler);
		System.out.println("Total Quantity Ordered : " + getTotalQuantityHandler.getTotalQuantity());
	}

}
