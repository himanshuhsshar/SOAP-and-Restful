package com.policyjaxb.test;

import java.io.File;
import java.util.Date;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.lic.insurance.policy.MemberInfoType;
import org.lic.insurance.policy.PlanType;
import org.lic.insurance.policy.PolicyType;
import org.xml.sax.SAXException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class MarshallingTest {
	public static void main(String[] args) throws JAXBException, SAXException {
		SchemaFactory schemaFactory = null;
		MemberInfoType memberInfo = null;
		JAXBContext jaxbContext = null;
		Marshaller marshaller = null;
		PolicyType policy = null;
		Schema policySchema = null;
		PlanType plan = null;

		plan = new PlanType();
		plan.setPlanNo("p0000001");
		plan.setPlanName("Gold Saver LifePlan");
		plan.setPlanType("Risk Coverage");
		plan.setMinEligibilityAge(18);
		plan.setMaxEligibilityAge(65);
		plan.setMinInsurredAmount(200000);

		memberInfo = new MemberInfoType();
		memberInfo.setFullname("Kenvin Peterson");
		memberInfo.setDob(new Date());
		memberInfo.setGender("Male");
		memberInfo.setAadharNo("adh0388933");

		policy = new PolicyType();
		policy.setPolicyNo("pl000001");
		policy.setTenure(60);
		policy.setInsurredAmount(500000);
		// policy.setMemberInfo(memberInfo);
		policy.setPlan(plan);

		schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		policySchema = schemaFactory.newSchema(new File(
				"D:\\work\\master\\webservices\\20223003\\WEBSERVICES\\policyjaxb\\src\\main\\resources\\policy.xsd"));

		jaxbContext = JAXBContext.newInstance("org.lic.insurance.policy");
		marshaller = jaxbContext.createMarshaller();
		marshaller.setSchema(policySchema);
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
		marshaller.marshal(policy, System.out);
	}
}
