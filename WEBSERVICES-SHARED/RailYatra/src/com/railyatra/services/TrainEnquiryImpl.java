package com.railyatra.services;

import java.rmi.RemoteException;

public class TrainEnquiryImpl implements TrainEnquiry {

	public String pnrStatus(String pnrNo) {
		String pnrStatus = null;

		if (pnrNo.equals("PNR001")) {
			pnrStatus = "WL/10";
		} else if (pnrNo.equals("PNR002")) {
			pnrStatus = "CONFIRMED";
		} else {
			pnrStatus = "RAC/3";
		}
		return pnrStatus;
	}

	public String trainStatus(String trainNo) throws RemoteException {
		String trainStatus = null;
		if (trainNo == null || trainNo.trim().equals("")) {
			throw new RemoteException("TrainNo cannot be blank");
		}
		if (trainNo.equals("1001")) {
			trainStatus = "ON-TIME";
		} else if (trainNo.equals("1002")) {
			trainStatus = "DELAYED 10 MINUTES";
		} else {
			trainStatus = "CANCELLED";
		}
		return trainStatus;
	}

}
