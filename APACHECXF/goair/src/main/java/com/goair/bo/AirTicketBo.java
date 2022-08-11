package com.goair.bo;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AirTicketBo {
	private String pnr;
	private String airlines;
	private String source;
	private String destination;
	private String lastName;
	private Date boardingTime;
	private String mobileNo;
	private String emailAddress;
	private double amount;
	private List<Integer> passengerNos;
	
}
