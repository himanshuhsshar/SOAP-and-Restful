package com.goair.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.goair.bo.AirTicketBo;

@Repository
public class AirTicketDao {
	private final String SQL_INSERT_AIR_TICKET = "insert into airticket(pnr, airlines, lastname, source, destination, boarding_time, mobile_no, email_address, amount) values(?,?,?,?,?,?,?,?,?)";
	private final String SQL_INSERT_AIR_TICKET_PASSENGER = "insert into ticket_passengers(pnr, passenger_no) values(?,?)";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveAirTicket(final AirTicketBo airTicketBo) {

		jdbcTemplate.update(SQL_INSERT_AIR_TICKET, airTicketBo.getPnr(), airTicketBo.getAirlines(),
				airTicketBo.getLastName(), airTicketBo.getSource(), airTicketBo.getDestination(),
				airTicketBo.getBoardingTime(), airTicketBo.getMobileNo(), airTicketBo.getEmailAddress(),
				airTicketBo.getAmount());
		
		for (int passengerNo : airTicketBo.getPassengerNos()) {
			jdbcTemplate.update(SQL_INSERT_AIR_TICKET_PASSENGER, airTicketBo.getPnr(), passengerNo);
		}

	}
}
