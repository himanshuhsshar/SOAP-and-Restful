//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.30 at 10:05:57 AM IST 
//


package org.lic.insurance.policy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="policyNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tenure" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="insurredAmount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="memberInfo" type="{http://www.lic.org/insurance/policy}memberInfoType"/&gt;
 *         &lt;element name="plan" type="{http://www.lic.org/insurance/policy}planType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="policy")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyType", propOrder = {
    "policyNo",
    "tenure",
    "insurredAmount",
    "memberInfo",
    "plan"
})
public class PolicyType {

    @XmlElement(required = true)
    protected String policyNo;
    protected int tenure;
    protected int insurredAmount;
    @XmlElement(required = true)
    protected MemberInfoType memberInfo;
    @XmlElement(required = true)
    protected PlanType plan;

    /**
     * Gets the value of the policyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNo(String value) {
        this.policyNo = value;
    }

    /**
     * Gets the value of the tenure property.
     * 
     */
    public int getTenure() {
        return tenure;
    }

    /**
     * Sets the value of the tenure property.
     * 
     */
    public void setTenure(int value) {
        this.tenure = value;
    }

    /**
     * Gets the value of the insurredAmount property.
     * 
     */
    public int getInsurredAmount() {
        return insurredAmount;
    }

    /**
     * Sets the value of the insurredAmount property.
     * 
     */
    public void setInsurredAmount(int value) {
        this.insurredAmount = value;
    }

    /**
     * Gets the value of the memberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MemberInfoType }
     *     
     */
    public MemberInfoType getMemberInfo() {
        return memberInfo;
    }

    /**
     * Sets the value of the memberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberInfoType }
     *     
     */
    public void setMemberInfo(MemberInfoType value) {
        this.memberInfo = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link PlanType }
     *     
     */
    public PlanType getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanType }
     *     
     */
    public void setPlan(PlanType value) {
        this.plan = value;
    }

}