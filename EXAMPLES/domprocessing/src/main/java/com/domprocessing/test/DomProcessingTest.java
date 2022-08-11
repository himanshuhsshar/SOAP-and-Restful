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
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse(new File("D:\\WebServices\\domprocessing\\src\\main\\resources\\po.xml"));
		Node rootNote = document.getFirstChild();
		System.out.println(rootNote.getNodeName());
		Node itemCodeNode = document.getFirstChild().getFirstChild().getFirstChild().getFirstChild();
		System.out.println(itemCodeNode.getNodeName());
		Node itemCodeValue = itemCodeNode.getFirstChild();
		System.out.println(itemCodeNode.getNodeName() + " : " + itemCodeValue.getNodeValue());
		Node quantityValue = itemCodeNode.getNextSibling().getFirstChild();
		System.out.println("Quantity : " + quantityValue.getNodeValue());
		int total = 0;
		NodeList quantityNodes = document.getElementsByTagName("quantity");
		for(int i=0; i < quantityNodes.getLength();i++) {
			Node n = quantityNodes.item(i);
			total += Integer.parseInt(n.getFirstChild().getNodeValue());
		}
		System.out.println("Total Quantity : " +total);
	}
}
