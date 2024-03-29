// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.policybazar.service;

import com.sun.xml.rpc.server.http.MessageContextProperties;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.soap.streaming.*;
import com.sun.xml.rpc.soap.message.*;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.soap.SOAPEncodingConstants;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.lang.reflect.*;
import java.lang.Class;
import com.sun.xml.rpc.client.SenderException;
import com.sun.xml.rpc.client.*;
import com.sun.xml.rpc.client.http.*;
import javax.xml.rpc.handler.*;
import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.soap.SOAPFaultException;

public class PolicyManager_Stub
    extends com.sun.xml.rpc.client.StubBase
    implements com.policybazar.service.PolicyManager {
    
    
    
    /*
     *  public constructor
     */
    public PolicyManager_Stub(HandlerChain handlerChain) {
        super(handlerChain);
        _setProperty(ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/ReligareInsurance/policyManager");
    }
    
    
    /*
     *  implementation of enroll
     */
    public com.policybazar.service.Policy enroll(com.policybazar.service.MemberInfo memberInfo, com.policybazar.service.EnrollmentInfo enrollmentInfo)
        throws java.rmi.RemoteException {
        
        try {
            
            StreamingSenderState _state = _start(_handlerChain);
            
            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(enroll_OPCODE);
            com.policybazar.service.PolicyManager_enroll_RequestStruct _myPolicyManager_enroll_RequestStruct =
                new com.policybazar.service.PolicyManager_enroll_RequestStruct();
            
            _myPolicyManager_enroll_RequestStruct.setMemberInfo(memberInfo);
            _myPolicyManager_enroll_RequestStruct.setEnrollmentInfo(enrollmentInfo);
            
            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_enroll_enroll_QNAME);
            _bodyBlock.setValue(_myPolicyManager_enroll_RequestStruct);
            _bodyBlock.setSerializer(ns1_myPolicyManager_enroll_RequestStruct_SOAPSerializer);
            _request.setBody(_bodyBlock);
            
            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "http://www.religare.com/insurance/service/enroll");
            
            _send((java.lang.String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);
            
            com.policybazar.service.PolicyManager_enroll_ResponseStruct _myPolicyManager_enroll_ResponseStruct = null;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _myPolicyManager_enroll_ResponseStruct =
                    (com.policybazar.service.PolicyManager_enroll_ResponseStruct)((SOAPDeserializationState)_responseObj).getInstance();
            } else {
                _myPolicyManager_enroll_ResponseStruct =
                    (com.policybazar.service.PolicyManager_enroll_ResponseStruct)_responseObj;
            }
            
            return _myPolicyManager_enroll_ResponseStruct.getResult();
        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }
    
    
    /*
     *  this method deserializes the request/response structure in the body
     */
    protected void _readFirstBodyElement(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState  state) throws Exception {
        int opcode = state.getRequest().getOperationCode();
        switch (opcode) {
            case enroll_OPCODE:
                _deserialize_enroll(bodyReader, deserializationContext, state);
                break;
            default:
                throw new SenderException("sender.response.unrecognizedOperation", java.lang.Integer.toString(opcode));
        }
    }
    
    
    
    /*
     * This method deserializes the body of the enroll operation.
     */
    private void _deserialize_enroll(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        java.lang.Object myPolicyManager_enroll_ResponseStructObj =
            ns1_myPolicyManager_enroll_ResponseStruct_SOAPSerializer.deserialize(ns1_enroll_enrollResponse_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_enroll_enrollResponse_QNAME);
        bodyBlock.setValue(myPolicyManager_enroll_ResponseStructObj);
        state.getResponse().setBody(bodyBlock);
    }
    
    
    
    public java.lang.String _getDefaultEnvelopeEncodingStyle() {
        return SOAPNamespaceConstants.ENCODING;
    }
    
    public java.lang.String _getImplicitEnvelopeEncodingStyle() {
        return "";
    }
    
    public java.lang.String _getEncodingStyle() {
        return SOAPNamespaceConstants.ENCODING;
    }
    
    public void _setEncodingStyle(java.lang.String encodingStyle) {
        throw new UnsupportedOperationException("cannot set encoding style");
    }
    
    
    
    
    
    /*
     * This method returns an array containing (prefix, nsURI) pairs.
     */
    protected java.lang.String[] _getNamespaceDeclarations() {
        return myNamespace_declarations;
    }
    
    /*
     * This method returns an array containing the names of the headers we understand.
     */
    public javax.xml.namespace.QName[] _getUnderstoodHeaders() {
        return understoodHeaderNames;
    }
    
    
    protected void _preHandlingHook(StreamingSenderState state) throws Exception {
        super._preHandlingHook(state);
    }
    
    
    protected boolean _preRequestSendingHook(StreamingSenderState state) throws Exception {
        boolean bool = false;
        bool = super._preRequestSendingHook(state);
        return bool;
    }
    
    public void _initialize(InternalTypeMappingRegistry registry) throws Exception {
        super._initialize(registry);
        ns1_myPolicyManager_enroll_ResponseStruct_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, com.policybazar.service.PolicyManager_enroll_ResponseStruct.class, ns1_enrollResponse_TYPE_QNAME);
        ns1_myPolicyManager_enroll_RequestStruct_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, com.policybazar.service.PolicyManager_enroll_RequestStruct.class, ns1_enroll_TYPE_QNAME);
    }
    
    private static final javax.xml.namespace.QName _portName = new QName("http://www.religare.com/insurance/service", "PolicyManagerSOAPPort");
    private static final int enroll_OPCODE = 0;
    private static final javax.xml.namespace.QName ns1_enroll_enroll_QNAME = new QName("http://www.religare.com/insurance/service", "enroll");
    private static final javax.xml.namespace.QName ns1_enroll_TYPE_QNAME = new QName("http://www.religare.com/insurance/service", "enroll");
    private CombinedSerializer ns1_myPolicyManager_enroll_RequestStruct_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_enroll_enrollResponse_QNAME = new QName("http://www.religare.com/insurance/service", "enrollResponse");
    private static final javax.xml.namespace.QName ns1_enrollResponse_TYPE_QNAME = new QName("http://www.religare.com/insurance/service", "enrollResponse");
    private CombinedSerializer ns1_myPolicyManager_enroll_ResponseStruct_SOAPSerializer;
    private static final java.lang.String[] myNamespace_declarations =
                                        new java.lang.String[] {
                                            "ns0", "http://www.religare.com/insurance/service",
                                            "ns1", "http://www.religare.com/insurance/types"
                                        };
    
    private static final QName[] understoodHeaderNames = new QName[] {  };
}
