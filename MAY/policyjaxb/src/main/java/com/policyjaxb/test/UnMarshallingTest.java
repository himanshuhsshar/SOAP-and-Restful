package com.policyjaxb.test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.lic.insurance.policy.PolicyType;
import org.xml.sax.SAXException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class UnMarshallingTest {
	public static void main(String[] args) throws JAXBException, SAXException {
		PolicyType policy = null;
		Schema policySchema = null;
		JAXBContext jaxbContext = null;
		Unmarshaller unmarshaller = null;
		SchemaFactory schemaFactory = null;
		JAXBElement<PolicyType> jaxbElement = null;

		schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		policySchema = schemaFactory.newSchema(new File(
				"D:\\work\\master\\webservices\\20223003\\WEBSERVICES\\policyjaxb\\src\\main\\resources\\policy.xsd"));

		jaxbContext = JAXBContext.newInstance("org.lic.insurance.policy");
		unmarshaller = jaxbContext.createUnmarshaller();
		unmarshaller.setSchema(policySchema);
		
		jaxbElement = (JAXBElement<PolicyType>) unmarshaller.unmarshal(new File(
				"D:\\work\\master\\webservices\\20223003\\WEBSERVICES\\policyjaxb\\src\\main\\resources\\policy.xml"));
		policy = jaxbElement.getValue();
		System.out.println("policy no : " + policy.getPolicyNo());
	}
}












