package com.divya.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.divya.classes.Airport;

public class AirportTestsApachePOI {

	private static final Logger LOGGER=LogManager.getLogger(AirportTestsApachePOI.class.getName());

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		LOGGER.info("__________________________________");
		
		Airport airport = new Airport();
		
	//	File f = new File(".//src//files//Database.xlsx");
		File f = new File("resources/Database.xlsx");

		XSSFWorkbook wb= new XSSFWorkbook(f);

		LOGGER.info("In AirportTestsApachePOI");
		HashMap<String,String> passenger;
		ArrayList<HashMap<String,String>> passengerArray=new ArrayList<HashMap<String,String>>();
		
		try {
			// reading data from excel for passengers from Database Excel .xlsx
			XSSFSheet sheet = wb.getSheet("Passenger");
			
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				passenger = new HashMap<String,String>();
				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
					String key=sheet.getRow(0).getCell(j).toString();
					String value=sheet.getRow(i).getCell(j).toString();
					passenger.put(key, value);
				}
				passengerArray.add(passenger);
			}
			
			for(int i=0;i<passengerArray.size();i++) {
				passenger = new HashMap<String,String>();
				passenger = passengerArray.get(i);
				
				String name = passenger.get("Name");
				int age = Integer.parseInt(passenger.get("Age"));
				String emailID = passenger.get("EmailID");
				int phoneNo = Integer.parseInt(passenger.get("PhoneNumber"));
				String proofOfID = passenger.get("ProofOfID");
				String dateOfTravel = passenger.get("DateOfTravel");
				String timeOfTravel = passenger.get("TimeOfTravel");
				String baggage = passenger.get("Baggage");
				String airlineNo = passenger.get("AirlineNo");
				String bookingNo = passenger.get("BookingNo");
					
				airport.addPassenger(name, age, emailID, phoneNo, proofOfID, dateOfTravel, timeOfTravel, baggage, airlineNo, bookingNo);
				
			}
		}catch(Exception e) {
			e.getMessage();
		}
		
		HashMap<String,String> aeroplane ;
		ArrayList<HashMap<String,String>> aeroplaneArray = new ArrayList<HashMap<String,String>>();
		
		try {
		
			XSSFSheet sheet = wb.getSheet("Airplane");
			
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				aeroplane=new HashMap<String,String>();
				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
					String key=sheet.getRow(0).getCell(j).toString();
					String value= sheet.getRow(i).getCell(j).toString();
					aeroplane.put(key, value);
				}
				aeroplaneArray.add(aeroplane);
			}
			
			for(int i=0;i<aeroplaneArray.size();i++) {
				aeroplane=new HashMap<String,String>();
				aeroplane = aeroplaneArray.get(i);

				String airlineName = aeroplane.get("AirlineName");
				String airlineNo = aeroplane.get("AirlineNo");
				String terminal = aeroplane.get("Terminal");
				String gate = aeroplane.get("Gate");
				int seats = Integer.parseInt(aeroplane.get("Seats"));
				int crew = Integer.parseInt(aeroplane.get("Crew"));
				String status = aeroplane.get("Status");
				String timeOfDelay = aeroplane.get("TimeOfDelay");
				String arrivalCity = aeroplane.get("ArrivalCity");
				String departureCity = aeroplane.get("DepartureCity");

				airport.addAeroplane(airlineName, airlineNo, terminal, gate, seats, crew, status, timeOfDelay, arrivalCity, departureCity);
			}
			
		}catch(Exception e) {
			e.getMessage();
			System.out.println("Error" + e);
		}

		wb.close();
	//	airport.getAeroplaneByAirlineName("AirlineName001");
		
	//	airport.getPassengerAeroplaneDetails("PassengerName001");
	}
}
