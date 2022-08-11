package com.policybazar.test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.policybazar.service.EnrollmentInfo;
import com.policybazar.service.MemberInfo;
import com.policybazar.service.Policy;
import com.policybazar.service.PolicyManager;
import com.policybazar.service.PolicyManagerService;
import com.policybazar.service.PolicyManagerService_Impl;

public class PolicyBazarTest {
	public static void main(String[] args) throws ServiceException, RemoteException {
		PolicyManagerService policyManagerService = new PolicyManagerService_Impl();
		PolicyManager policyManager = policyManagerService.getPolicyManagerSOAPPort();
		
		MemberInfo memberInfo = new MemberInfo("Alex",23,"Male","819283982","himanshu.hs951@gmail.com");
		EnrollmentInfo enrollmentInfo = new EnrollmentInfo("P-1003",60,2000);
		
		Policy policy = policyManager.enroll(memberInfo, enrollmentInfo);
		System.out.println(policy.getPolicyNo());
	}
}
