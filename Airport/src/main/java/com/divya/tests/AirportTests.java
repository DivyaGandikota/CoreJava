package com.divya.tests;

import com.divya.classes.Airport;

public class AirportTests {

	public static void main(String[] args) {
		
		Airport airport = new Airport();
		
		airport.addPassenger("PIDNAME1", 26, "xyz@gmail.com", 123444555, "pID01", "01/04/2019", "10.30", "1", "AirlineNo001", "EDF#RFD");
		airport.addPassenger("PIDNAME2", 26, "abc@gmail.com", 232121313, "pID02", "01/04/2019", "10.30", "1", "AirlineNo002", "EDF#123");

	//	airport.getPassengerByName("PIDNAME1");
		
		airport.addAeroplane("AirlineName001", "AirlineNo001", "TerminalA", "Gate1A", 100, 9, "OnTime", "0mins", "MCO", "DC");
		airport.addAeroplane("AirlineName002", "AirlineNo002", "TerminalA", "Gate1B", 100, 9, "OnTime", "0mins", "DEN", "ATL");

		airport.getAllAeroplanes();
	//	airport.getAeroplaneByAirlineName("AirlineName001");
		
	//	airport.getPassengerAeroplaneDetails("PIDNAME1");
		
		airport.removeAirline("AirlineName002");
		
	//	airport.getAeroplaneByAirlineName("AirlineName002");
		airport.getAllAeroplanes();


	}
}
