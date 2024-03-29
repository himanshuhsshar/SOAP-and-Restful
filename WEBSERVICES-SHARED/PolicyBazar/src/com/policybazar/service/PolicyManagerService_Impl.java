// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.policybazar.service;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.client.ServiceExceptionImpl;
import com.sun.xml.rpc.util.exception.*;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.client.HandlerChainImpl;
import javax.xml.rpc.*;
import javax.xml.rpc.encoding.*;
import javax.xml.rpc.handler.HandlerChain;
import javax.xml.rpc.handler.HandlerInfo;
import javax.xml.namespace.QName;

public class PolicyManagerService_Impl extends
		com.sun.xml.rpc.client.BasicService implements PolicyManagerService {
	private static final QName serviceName = new QName(
			"http://www.religare.com/insurance/service", "PolicyManagerService");
	private static final QName ns1_PolicyManagerSOAPPort_QNAME = new QName(
			"http://www.religare.com/insurance/service",
			"PolicyManagerSOAPPort");
	private static final Class policyManager_PortClass = com.policybazar.service.PolicyManager.class;

	public PolicyManagerService_Impl() {
		super(
				serviceName,
				new QName[] { ns1_PolicyManagerSOAPPort_QNAME },
				new com.policybazar.service.PolicyManagerService_SerializerRegistry()
						.getRegistry());

	}

	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			java.lang.Class serviceDefInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (portName.equals(ns1_PolicyManagerSOAPPort_QNAME)
					&& serviceDefInterface.equals(policyManager_PortClass)) {
				return getPolicyManagerSOAPPort();
			}
		} catch (Exception e) {
			throw new ServiceExceptionImpl(new LocalizableExceptionAdapter(e));
		}
		return super.getPort(portName, serviceDefInterface);
	}

	public java.rmi.Remote getPort(java.lang.Class serviceDefInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (serviceDefInterface.equals(policyManager_PortClass)) {
				return getPolicyManagerSOAPPort();
			}
		} catch (Exception e) {
			throw new ServiceExceptionImpl(new LocalizableExceptionAdapter(e));
		}
		return super.getPort(serviceDefInterface);
	}

	public com.policybazar.service.PolicyManager getPolicyManagerSOAPPort() {
		java.lang.String[] roles = new java.lang.String[] {};
		HandlerChainImpl handlerChain = new HandlerChainImpl(
				getHandlerRegistry().getHandlerChain(
						ns1_PolicyManagerSOAPPort_QNAME));
		handlerChain.setRoles(roles);
		com.policybazar.service.PolicyManager_Stub stub = new com.policybazar.service.PolicyManager_Stub(
				handlerChain);
		try {
			stub._initialize(super.internalTypeRegistry);
		} catch (JAXRPCException e) {
			throw e;
		} catch (Exception e) {
			throw new JAXRPCException(e.getMessage(), e);
		}
		return stub;
	}
}
