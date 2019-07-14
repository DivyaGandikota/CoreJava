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

import com.divya.classes.Route;

public class BusTestsApachePOI {

	private static final Logger LOGGER = LogManager.getLogger(BusTestsApachePOI.class.getName());
	public static void main(String[] args) throws InvalidFormatException, IOException {

		LOGGER.info("----------------------------------------");
		Route tests = new Route();

		File f = new File("resources/Database.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		
		HashMap<String, String> passenger;
		ArrayList<HashMap<String, String>> passengerArray = new ArrayList<HashMap<String, String>>();

		try {
			XSSFSheet sheet = wb.getSheet("Passenger");
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				passenger = new HashMap<String,String>();
				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
					String key = sheet.getRow(0).getCell(j).toString();
					String value = sheet.getRow(i).getCell(j).toString();
					passenger.put(key, value);
				}
				passengerArray.add(passenger);
			}
			
			for(int i=0;i<passengerArray.size();i++) {
				passenger=new HashMap<String,String>();
				passenger=passengerArray.get(i);
				
				String id=passenger.get("ID");
				String name=passenger.get("Name");
				String age=passenger.get("Age");
				String gender=passenger.get("Gender");
				String phoneNo=passenger.get("PhoneNumber");
				
				tests.addPassenger(id, name, age, gender, phoneNo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		HashMap<String, String> ticket;
		ArrayList<HashMap<String, String>> ticketArray = new ArrayList<HashMap<String, String>>();

		try {
			
			
			XSSFSheet sheet = wb.getSheet("Ticket");
			
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				ticket = new HashMap<String,String>();
				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
					String key = sheet.getRow(0).getCell(j).toString();
					String value = sheet.getRow(i).getCell(j).toString();
					ticket.put(key, value);
				}
				ticketArray.add(ticket);
			}
			
			for(int i=0;i<ticketArray.size();i++) {
				ticket=new HashMap<String,String>();
				ticket=ticketArray.get(i);
				
				String ticketID=ticket.get("TicketID");
				double cost=Double.parseDouble(ticket.get("Cost"));
				boolean isIssued=Boolean.parseBoolean(ticket.get("IsIssued"));
				String busNo=ticket.get("BusNo");
				String passengerID=ticket.get("PassengerID");
				
				tests.addTicket(ticketID, cost, isIssued, busNo, passengerID);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		wb.close();
	}
}
