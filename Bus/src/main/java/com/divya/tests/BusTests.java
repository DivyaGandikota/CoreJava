package com.divya.tests;

import com.divya.classes.Route;

public class BusTests {

	public static void main(String[] args) {
		Route tests=new Route();
		
		tests.addPassenger("pid001", "passengerName1", "27", "F", "123444444");
		tests.addPassenger("pid002", "passengerName2", "27", "M", "001111111");
		
		tests.getPassengerByID("pid001");

		tests.updatePassengerPhoneNo("pid001", "1111111111");
		
		tests.getPassengerByID("pid001");


		tests.addTicket("ticket001", 80.00, true,"bus001","pid001");
		tests.addTicket("ticket002", 80.00, true ,"bus001","pid002");
		
	//	tests.getTicketByID("ticket001");
		
		tests.setBusDriver("Bus001", "Driver001");
		System.out.println(tests.getBusDriver());

		tests.updateBusDriver("Bus001", "Driver002");
		System.out.println(tests.getBusDriver());
		
		tests.removeBusDriver("Bus001");
		System.out.println(tests.getBusDriver());
		
		tests.setRoute("Route1");
		System.out.println("Before Update Route:" +tests.getRoute());

		tests.updateRoute("Route1", "Route2");
		System.out.println(tests.getRoute());
		
		tests.getPassengerDriverBusDetails("ticket001");

	}
}
