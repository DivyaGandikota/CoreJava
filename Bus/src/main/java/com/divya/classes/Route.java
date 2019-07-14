package com.divya.classes;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.divya.pojos.Passenger;
import com.divya.pojos.Ticket;

public class Route {

	private String route;
	private String date;
	private String time;
	
	private ArrayList<Passenger> passengers;
	private ArrayList<Ticket> tickets;

	private HashMap<String,String> busDriver;
	
	private static final Logger LOGGER = LogManager.getLogger(Route.class.getName());
	
	public Route() {
		passengers=new ArrayList<Passenger>();
		tickets=new ArrayList<Ticket>();
		
		busDriver=new HashMap<String,String>();
	}
	
	public HashMap<String,String> getBusDriver(){
		return busDriver;
	}
	public void setBusDriver(String busNo,String driverID) {
		this.busDriver.put(busNo, driverID);
	}
	public void updateBusDriver(String busNo,String driverID) {
		if(busDriver.containsKey(busNo)) {
			this.busDriver.put(busNo, driverID);
		}
		else {
		//	System.out.println("Bus Number doesn't exist to Update");
			LOGGER.warn("Bus Number doesn't exist to Update");
		}
	}
	public void removeBusDriver(String busNo) {
		if(busDriver.containsKey(busNo)) {
			System.out.println(this.busDriver.remove(busNo) + " is removed");
			LOGGER.info(this.busDriver.remove(busNo) + " is removed");
			
		}
		else {
		//	System.out.println("Bus Number doesn't exist to Remove");
			LOGGER.warn("Bus Number doesn't exist to Remove");	
		}
	}
	
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public void updateRoute(String oldRoute,String newRoute) {
		if(this.route.equalsIgnoreCase(oldRoute)) {
			this.route=newRoute;
		}
		else
			//System.out.println("Given Old Route doesnt exist");
			LOGGER.warn("Given Old Route doesnt exist");
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}	
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	

	public void addPassenger(String id,String name,String age,String gender,String phoneNo) {
		Passenger passenger=new Passenger();
		
		passenger.setId(id);
		passenger.setName(name);
		passenger.setAge(age);
		passenger.setGender(gender);
		passenger.setPhoneNo(phoneNo);
		
		passengers.add(passenger);
	//	System.out.println(passenger);
		LOGGER.info(passenger);
	}
	public void updatePassengerPhoneNo(String id, String phoneNo) {
		boolean count=false;
		for(int i=0;i<passengers.size();i++) {
			if(passengers.get(i).getId().equalsIgnoreCase(id)) {
				passengers.get(i).setPhoneNo(phoneNo);
				count=true;
			}
		}
		if(count) 
	//		System.out.println(" Passenger details updated with phoneNo");
		LOGGER.info(" Passenger details updated with phoneNo");

		else
		//	System.out.println("Passenger details not updated.");
			LOGGER.warn("Passenger details not updated.");

	}
	public Passenger getPassengerByID(String id) {
		for(int i=0;i<passengers.size();i++) {
			if(passengers.get(i).getId().equalsIgnoreCase(id)) {
				System.out.println(passengers.get(i));
				return passengers.get(i);
			}
		}
		//System.out.println("No Passenger");
		LOGGER.warn("No Passenger");
		return null;
	}
	
	public void addTicket(String ticketID,double cost, boolean isIssued,String busNo, String passengerID) {
		Ticket ticket = new Ticket();
		ticket.setTicketID(ticketID);
		ticket.setCost(cost);
		ticket.setIsIssued(isIssued);
		ticket.setBusNo(busNo);
		ticket.setPassengerID(passengerID);
	//	ticket.setDriverID(driverID);
		tickets.add(ticket);
		//System.out.println(ticket);
		LOGGER.info(ticket);
	}
	public Ticket getTicketByID(String ticketID) {
		for(int i=0;i<tickets.size();i++) {
			if(tickets.get(i).getTicketID().equalsIgnoreCase(ticketID)) {
				return tickets.get(i);
			}
		}
	//	System.out.println("Ticket not available");
		LOGGER.warn("Ticket not available");
		return null;
	}
	
	public void getPassengerDriverBusDetails(String ticketID) {
		
		Ticket ticket = getTicketByID(ticketID);
		//System.out.println("Ticket \t : " + ticket);
		LOGGER.info("Ticket \t : " + ticket);
			
		Passenger passenger= getPassengerByID(ticket.getPassengerID());
		//System.out.println("Passenger: " +passenger);
		LOGGER.info("Passenger: " +passenger);
		
	//	System.out.println("Driver \t : " +getDriverByID(ticket.getDriverID()));
		
		//System.out.println("BusDriver Info: "+ getBusDriver());
		LOGGER.info("BusDriver Info: "+ getBusDriver());
	}
	
}
