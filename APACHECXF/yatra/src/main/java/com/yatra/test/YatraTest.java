package com.yatra.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yatra.dto.PassengerDto;
import com.yatra.dto.TicketDto;
import com.yatra.form.BookAirTicketForm;
import com.yatra.invoker.TicketManagerInvoker;

public class YatraTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		TicketManagerInvoker invoker = context.getBean("ticketManagerInvoker", TicketManagerInvoker.class);
		
		List<PassengerDto> passengerDtos = Arrays
				.asList(new PassengerDto[] { PassengerDto.builder().age(23).gender("male").fullname("jack").build() });
		BookAirTicketForm form = BookAirTicketForm.builder().source("Hyderbad").destination("Banglore")
				.emailAddress("jack@gmail.com").journeyDate(new Date()).mobileNo("903838934").passengers(passengerDtos)
				.build();

		TicketDto dto = invoker.bookTicket(form);
		System.out.println(dto);
	}
}
