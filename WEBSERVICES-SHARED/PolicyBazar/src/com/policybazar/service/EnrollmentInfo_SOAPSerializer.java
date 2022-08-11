// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.policybazar.service;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;

public class EnrollmentInfo_SOAPSerializer extends ObjectSerializerBase implements Initializable {
    private static final javax.xml.namespace.QName ns1_plan$2d$no_QNAME = new QName("", "plan-no");
    private static final javax.xml.namespace.QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final javax.xml.namespace.QName ns1_tenure_QNAME = new QName("", "tenure");
    private static final javax.xml.namespace.QName ns3_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns3_myns3__int__int_Int_Serializer;
    private static final javax.xml.namespace.QName ns1_insurred$2d$amount_QNAME = new QName("", "insurred-amount");
    private static final javax.xml.namespace.QName ns3_float_TYPE_QNAME = SchemaConstants.QNAME_TYPE_FLOAT;
    private CombinedSerializer ns3_myns3__float__float_Float_Serializer;
    private static final int myPLANNO_INDEX = 0;
    private static final int myTENURE_INDEX = 1;
    private static final int myINSURREDAMOUNT_INDEX = 2;
    
    public EnrollmentInfo_SOAPSerializer(QName type, boolean encodeType, boolean isNullable, String encodingStyle) {
        super(type, encodeType, isNullable, encodingStyle);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws java.lang.Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, java.lang.String.class, ns3_string_TYPE_QNAME);
        ns3_myns3__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, int.class, ns3_int_TYPE_QNAME);
        ns3_myns3__float__float_Float_Serializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, float.class, ns3_float_TYPE_QNAME);
    }
    
    public java.lang.Object doDeserialize(SOAPDeserializationState state, XMLReader reader,
        SOAPDeserializationContext context) throws java.lang.Exception {
        com.policybazar.service.EnrollmentInfo instance = new com.policybazar.service.EnrollmentInfo();
        com.policybazar.service.EnrollmentInfo_SOAPBuilder builder = null;
        java.lang.Object member;
        boolean isComplete = true;
        javax.xml.namespace.QName elementName;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_plan$2d$no_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_plan$2d$no_QNAME, reader, context);
                if (member instanceof SOAPDeserializationState) {
                    if (builder == null) {
                        builder = new com.policybazar.service.EnrollmentInfo_SOAPBuilder();
                    }
                    state = registerWithMemberState(instance, state, member, myPLANNO_INDEX, builder);
                    isComplete = false;
                } else {
                    instance.setPlanNo((java.lang.String)member);
                }
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_tenure_QNAME)) {
                member = ns3_myns3__int__int_Int_Serializer.deserialize(ns1_tenure_QNAME, reader, context);
                instance.setTenure(((java.lang.Integer)member).intValue());
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_insurred$2d$amount_QNAME)) {
                member = ns3_myns3__float__float_Float_Serializer.deserialize(ns1_insurred$2d$amount_QNAME, reader, context);
                instance.setInsurredAmount(((Float)member).floatValue());
                reader.nextElementContent();
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (isComplete ? (java.lang.Object)instance : (java.lang.Object)state);
    }
    
    public void doSerializeAttributes(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.policybazar.service.EnrollmentInfo instance = (com.policybazar.service.EnrollmentInfo)obj;
        
    }
    
    public void doSerializeInstance(java.lang.Object obj, XMLWriter writer, SOAPSerializationContext context) throws java.lang.Exception {
        com.policybazar.service.EnrollmentInfo instance = (com.policybazar.service.EnrollmentInfo)obj;
        
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getPlanNo(), ns1_plan$2d$no_QNAME, null, writer, context);
        ns3_myns3__int__int_Int_Serializer.serialize(new java.lang.Integer(instance.getTenure()), ns1_tenure_QNAME, null, writer, context);
        ns3_myns3__float__float_Float_Serializer.serialize(new Float(instance.getInsurredAmount()), ns1_insurred$2d$amount_QNAME, null, writer, context);
    }
}
