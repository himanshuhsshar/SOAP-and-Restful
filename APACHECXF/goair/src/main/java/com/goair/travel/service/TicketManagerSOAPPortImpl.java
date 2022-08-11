
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.goair.travel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import com.goair.bo.AirTicketBo;
import com.goair.bo.PassengerBo;
import com.goair.dao.AirTicketDao;
import com.goair.dao.PassengerDao;
import com.goair.travel.types.AirTicket;
import com.goair.travel.types.Passenger;
import com.goair.travel.types.TravelPlan.JourneyInfo;

/**
 * This class was generated by Apache CXF 3.5.3 2022-07-29T23:27:29.467-04:00
 * Generated source version: 3.5.3
 *
 */

@javax.jws.WebService(serviceName = "TicketManagerService", portName = "TicketManagerSOAPPort", targetNamespace = "http://www.goair.com/travel/service", wsdlLocation = "WEB-INF/TicketManager.wsdl", endpointInterface = "com.goair.travel.service.TicketManager")

public class TicketManagerSOAPPortImpl implements TicketManager {

	private static final Logger LOG = Logger.getLogger(TicketManagerSOAPPortImpl.class.getName());
	private PassengerDao passengerDao;
	private AirTicketDao airTicketDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.goair.travel.service.TicketManager#bookTicket(com.goair.travel.types.
	 * TravelPlan travelPlan)*
	 */
	public com.goair.travel.types.AirTicket bookTicket(com.goair.travel.types.TravelPlan travelPlan) {
		LOG.info("Executing operation bookTicket");
		PassengerBo bo = null;
		JourneyInfo journeyInfo = null;
		AirTicketBo airTicketBo = null;
		List<Integer> passengerNos = null;

		try {
			com.goair.travel.types.AirTicket _return = null;
			passengerNos = new ArrayList<Integer>();

			for (Passenger passenger : travelPlan.getPassengers()) {
				bo = PassengerBo.builder().fullname(passenger.getFullname()).age(passenger.getAge())
						.gender(passenger.getGender()).build();
				int passengerNo = passengerDao.savePassenger(bo);
				passengerNos.add(passengerNo);
			}
			journeyInfo = travelPlan.getJourneyInfo();
			airTicketBo = AirTicketBo.builder().pnr(UUID.randomUUID().toString().substring(0, 6)).airlines("goair")
					.lastName(travelPlan.getPassengers().get(0).getFullname()).source(journeyInfo.getSource())
					.destination(journeyInfo.getDestination()).boardingTime(journeyInfo.getJourneyDt())
					.mobileNo(journeyInfo.getMobileNo()).emailAddress(journeyInfo.getEmailAddress()).amount(9383)
					.passengerNos(passengerNos).build();
			airTicketDao.saveAirTicket(airTicketBo);

			_return = new AirTicket();
			_return.setAirlines(airTicketBo.getAirlines());
			_return.setAmount(airTicketBo.getAmount());
			_return.setBoardingTime(airTicketBo.getBoardingTime());
			_return.setDestination(airTicketBo.getDestination());
			_return.setSource(airTicketBo.getSource());
			_return.setPnr(airTicketBo.getPnr());

			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	public void setPassengerDao(PassengerDao passengerDao) {
		this.passengerDao = passengerDao;
	}

	public void setAirTicketDao(AirTicketDao airTicketDao) {
		this.airTicketDao = airTicketDao;
	}

}
