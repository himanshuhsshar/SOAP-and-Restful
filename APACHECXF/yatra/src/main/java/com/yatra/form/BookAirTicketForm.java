package com.yatra.form;

import java.util.Date;
import java.util.List;

import com.yatra.dto.PassengerDto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BookAirTicketForm {
	private String source;
	private String destination;
	private Date journeyDate;
	private String mobileNo;
	private String emailAddress;
	private List<PassengerDto> passengers;
}
