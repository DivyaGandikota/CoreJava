package com.divya.pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aeroplane {

	private String airlineName;
	private String airlineNo;
	private String terminal;
	private String gate;
	private int seats;
	private int crew;
	private String status;
	private String timeOfDelay;
	private String arrivalCity;
	private String departureCity;
//	private ArrayList<Passenger> passengerList;
	
	private static final Logger LOGGER = LogManager.getLogger(Aeroplane.class.getName());
	
	public String getAirlineName() {
		LOGGER.debug(airlineName);
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		LOGGER.debug(airlineName);
		this.airlineName = airlineName;
	}
	public String getAirlineNo() {
		LOGGER.debug(airlineNo);
		return airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		LOGGER.debug(airlineNo);
		this.airlineNo = airlineNo;
	}
	public String getTerminal() {
		LOGGER.debug(terminal);
		return terminal;
	}
	public void setTerminal(String terminal) {
		LOGGER.debug(terminal);
		this.terminal = terminal;
	}
	public String getGate() {
		LOGGER.debug(gate);
		return gate;
	}
	public void setGate(String gate) {
		LOGGER.debug(gate);
		this.gate = gate;
	}
	public int getSeats() {
		LOGGER.debug(seats);
		return seats;
	}
	public void setSeats(int seats) {
		LOGGER.debug(seats);
		this.seats = seats;
	}
	public int getCrew() {
		LOGGER.debug(crew);
		return crew;
	}
	public void setCrew(int crew) {
		LOGGER.debug(crew);
		this.crew = crew;
	}
	public String getStatus() {
		LOGGER.debug(status);
		return status;
	}
	public void setStatus(String status) {
		LOGGER.debug(status);
		this.status = status;
	}
	public String getTimeOfDelay() {
		LOGGER.debug(timeOfDelay);
		return timeOfDelay;
	}
	public void setTimeOfDelay(String timeOfDelay) {
		LOGGER.debug(timeOfDelay);
		this.timeOfDelay = timeOfDelay;
	}
	public String getArrivalCity() {
		LOGGER.debug(arrivalCity);
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		LOGGER.debug(arrivalCity);
		this.arrivalCity = arrivalCity;
	}
	public String getDepartureCity() {
		LOGGER.debug(departureCity);
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		LOGGER.debug(departureCity);
		this.departureCity = departureCity;
	}
	/*public ArrayList<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(ArrayList<Passenger> passengerList) {
		this.passengerList = passengerList;
	}*/
	@Override
	public String toString() {
		return "Aeroplane [airlineName=" + airlineName + ", airlineNo=" + airlineNo + ", terminal=" + terminal
				+ ", gate=" + gate + ", seats=" + seats + ", crew=" + crew + ", status=" + status + ", timeOfDelay="
				+ timeOfDelay + ", arrivalCity=" + arrivalCity + ", departureCity=" + departureCity + "]";
	}
	
	
	
}
