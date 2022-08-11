package com.domprocessing.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomProcessingTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File(
				"D:\\work\\master\\webservices\\20223003\\WEBSERVICES\\domprocessing\\src\\main\\resources\\po.xml"));
		// Node rootNode = doc.getFirstChild();
		// System.out.println(rootNode.getNodeName());
		Node itemCodeNode = doc.getFirstChild().getFirstChild().getFirstChild().getFirstChild();
		Node itemCodeValue = itemCodeNode.getFirstChild();
		System.out.println(itemCodeNode.getNodeName() + ": " + itemCodeValue.getNodeValue());

		Node quantityValue = itemCodeNode.getNextSibling().getFirstChild();
		System.out.println("quantity : " + quantityValue.getNodeValue());

		int total = 0;
		NodeList quantityNodes = doc.getElementsByTagName("quantity");
		for (int i = 0; i < quantityNodes.getLength(); i++) {
			Node n = quantityNodes.item(i);
			total += Integer.parseInt(n.getFirstChild().getNodeValue());

		}
		System.out.println("total quantity : " + total);
	}
}
