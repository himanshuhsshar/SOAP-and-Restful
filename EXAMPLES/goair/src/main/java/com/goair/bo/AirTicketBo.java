package com.goair.bo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AirTicketBo {
	private String pnr;
	private String airlines;
	private String source;
	private String destination;
	private String name;
	private Date boardingTime;
	private String mobileNo;
	private String emailAddress;
	private double amount;
	private List<Integer> passengerNos;
}
