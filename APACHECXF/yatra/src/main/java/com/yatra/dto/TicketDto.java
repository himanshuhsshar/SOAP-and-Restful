package com.yatra.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class TicketDto {
	private String pnr;
	private String airlines;
	private String source;
	private String destination;
	private Date boardingTime;
	private double amount;

}
