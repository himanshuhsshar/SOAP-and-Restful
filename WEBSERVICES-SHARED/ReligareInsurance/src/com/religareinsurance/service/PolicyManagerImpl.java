package com.religareinsurance.service;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.UUID;

public class PolicyManagerImpl implements PolicyManager {

	public Policy enroll(MemberInfo memberInfo, EnrollmentInfo enrollmentInfo)
			throws RemoteException {
		Policy policy = null;
		policy = new Policy();
		policy.setPolicyNo(UUID.randomUUID().toString());
		policy.setPolicyHolderName(memberInfo.getFullName());
		policy.setEffectiveFrom(Calendar.getInstance());
		policy.setValidTill(Calendar.getInstance());
		policy.setInsurredAmount(enrollmentInfo.getInsurredAmount());
		return policy;
	}

}
