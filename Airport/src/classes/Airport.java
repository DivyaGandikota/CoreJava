package classes;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pojos.Aeroplane;
import pojos.Passenger;

public class Airport {

	private String name;
	private String location;
	private ArrayList<String> gates;
	private ArrayList<String> terminals;
	private ArrayList<Aeroplane> aeroplanes;
	private ArrayList<Passenger> passengers;
	
	private static final Logger LOGGER=LogManager.getLogger(Airport.class.getName());
	
	public Airport() {
		aeroplanes=new ArrayList<Aeroplane>();
		passengers=new ArrayList<Passenger>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<String> getGates() {
		return gates;
	}
	public void setGates(ArrayList<String> gates) {
		this.gates = gates;
	}
	public ArrayList<String> getTerminals() {
		return terminals;
	}
	public void setTerminals(ArrayList<String> terminals) {
		this.terminals = terminals;
	}
	public ArrayList<Aeroplane> getAeroplanes() {
		return aeroplanes;
	}
	public void setAeroplanes(ArrayList<Aeroplane> aeroplanes) {
		this.aeroplanes = aeroplanes;
	}
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	public void addPassenger(String name, int age, String emailID, int phoneNo, String proofOfID, String dateOfTravel,String timeOfTravel, String baggage, String airlineNo, String bookingNo) {
		
		Passenger passenger=new Passenger();
		
		passenger.setName(name);
		passenger.setAge(age);
		passenger.setEmailID(emailID);
		passenger.setPhoneNo(phoneNo);
		passenger.setProofOfID(proofOfID);
		passenger.setDateOfTravel(dateOfTravel);
		passenger.setTimeOfTravel(timeOfTravel);
		passenger.setBaggage(baggage);
		passenger.setAirlineNo(airlineNo);
		passenger.setBookingNo(bookingNo);
		
		passengers.add(passenger);
	//	System.out.println(passenger);
		LOGGER.info(passenger);
	}
	public void addAeroplane(String airlineName,String airlineNo,String terminal,String gate,int seats,int crew,String status,String timeOfDelay,String arrivalCity,String departureCity) {
	
		Aeroplane aeroplane = new Aeroplane();
		
		aeroplane.setAirlineName(airlineName);
		aeroplane.setAirlineNo(airlineNo);
		aeroplane.setTerminal(terminal);
		aeroplane.setGate(gate);
		aeroplane.setSeats(seats);
		aeroplane.setCrew(crew);
		aeroplane.setStatus(status);
		aeroplane.setTimeOfDelay(timeOfDelay);
		aeroplane.setArrivalCity(arrivalCity);
		aeroplane.setDepartureCity(departureCity);
		
		aeroplanes.add(aeroplane);
	//	System.out.println(aeroplane);
		LOGGER.info(aeroplane);
	}
	public Passenger getPassengerByName(String name) {
		for(int i=0;i<passengers.size();i++) {
			if(passengers.get(i).getName().equalsIgnoreCase(name)) {
			//	System.out.println(passengers.get(i));
				return passengers.get(i);
			}
		}
		LOGGER.info("No Passenger");
		//System.out.println("No Passenger");
		return null;
	}
	public Aeroplane getAeroplaneByAirlineName(String airlineName) {
		for(int i=0;i<aeroplanes.size();i++) {
			if(aeroplanes.get(i).getAirlineName().equalsIgnoreCase(airlineName)) {
				System.out.println(aeroplanes.get(i));
				return aeroplanes.get(i);
			}
		}
		LOGGER.info("No Aeroplane");
		//System.out.println("No Aeroplane");
		return null;
	}
	public Aeroplane getAeroplaneByAirlineNo(String airlineNo) {
		for(int i=0;i<aeroplanes.size();i++) {
			if(aeroplanes.get(i).getAirlineNo().equalsIgnoreCase(airlineNo)) {
				return aeroplanes.get(i);
			}
		}
		LOGGER.info("No Airline Number in Aeroplane");
		//System.out.println("No Airline Number in Aeroplane");
		return null;
	}
	public void getPassengerAeroplaneDetails(String name) {
		
		Passenger passenger = getPassengerByName(name);
		//System.out.println(passenger);
		LOGGER.info(passenger);

		Aeroplane aeroplane=getAeroplaneByAirlineNo(passenger.getAirlineNo());
		//System.out.println(aeroplane);
		LOGGER.info(aeroplane);
	}
	public void getAllAeroplanes() {
		for(int i=0;i<aeroplanes.size();i++) {
			System.out.println(aeroplanes.get(i));
		}
	}
	public String removeAirline(String airlineName) {
		for(int i=0;i<=aeroplanes.size();i++) {
			if(aeroplanes.get(i).getAirlineName().equalsIgnoreCase(airlineName)){
			//	System.out.println("Removed: "+aeroplanes.remove(i).getAirlineName());
				LOGGER.info("Removed: "+aeroplanes.remove(i).getAirlineName());
				return "Removed";
			}
		}
		//System.out.println("No Airlines in list");
		LOGGER.info("No Airlines in list");
		return null;
	}
}
