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

public class TraverseXmlTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
		Document document = builder.parse(new File("D:\\WebServices\\domprocessing\\src\\main\\resources\\po.xml"));
		visitNode(document);
	}

	private static void visitNode(Node n) {
		if (n.getNodeType() == Node.DOCUMENT_NODE) {
			Node rootNode = n.getFirstChild();
			visitNode(rootNode);
		} else if (n.getNodeType() == Node.ELEMENT_NODE) {
			System.out.println("<" + n.getNodeName() + ">");
			NodeList children = n.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				Node child = children.item(i);
				visitNode(child);
			}
			System.out.println("</" + n.getNodeName() + ">");
		} else if (n.getNodeType() == Node.TEXT_NODE) {
			System.out.println(n.getNodeValue());
		}
	}

}
