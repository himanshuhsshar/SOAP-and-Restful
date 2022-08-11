package com.yatra.invoker;

import com.goair.travel.service.TicketManager;
import com.goair.travel.types.AirTicket;
import com.goair.travel.types.Passenger;
import com.goair.travel.types.TravelPlan;
import com.goair.travel.types.TravelPlan.JourneyInfo;
import com.yatra.dto.PassengerDto;
import com.yatra.dto.TicketDto;
import com.yatra.form.BookAirTicketForm;

public class TicketManagerInvoker {
	private TicketManager ticketManager;

	public TicketDto bookTicket(BookAirTicketForm bookAirTicketForm) {
		TicketDto dto = null;
		TravelPlan travelPlan = null;
		JourneyInfo journeyInfo = null;
		Passenger passenger = null;
		AirTicket airTicket = null;

		travelPlan = new TravelPlan();
		journeyInfo = new JourneyInfo();
		journeyInfo.setSource(bookAirTicketForm.getSource());
		journeyInfo.setDestination(bookAirTicketForm.getDestination());
		journeyInfo.setEmailAddress(bookAirTicketForm.getEmailAddress());
		journeyInfo.setMobileNo(bookAirTicketForm.getMobileNo());
		journeyInfo.setJourneyDt(bookAirTicketForm.getJourneyDate());

		for (PassengerDto passengerDto : bookAirTicketForm.getPassengers()) {
			passenger = new Passenger();
			passenger.setFullname(passengerDto.getFullname());
			passenger.setAge(passengerDto.getAge());
			passenger.setGender(passengerDto.getGender());
			travelPlan.getPassengers().add(passenger);
		}

		travelPlan.setJourneyInfo(journeyInfo);
		airTicket = ticketManager.bookTicket(travelPlan);

		dto = TicketDto.builder().source(airTicket.getSource()).destination(airTicket.getDestination())
				.airlines(airTicket.getAirlines()).pnr(airTicket.getPnr()).boardingTime(airTicket.getBoardingTime())
				.amount(airTicket.getAmount()).build();

		return dto;
	}

	public void setTicketManager(TicketManager ticketManager) {
		this.ticketManager = ticketManager;
	}

}
