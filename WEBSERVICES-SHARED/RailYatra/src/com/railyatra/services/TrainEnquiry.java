package com.railyatra.services;

import java.rmi.RemoteException;

public interface TrainEnquiry extends java.rmi.Remote{
	
	String pnrStatus(String pnrNo) throws RemoteException;
	
	String trainStatus(String trainNo) throws RemoteException;

}
