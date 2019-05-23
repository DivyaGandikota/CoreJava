package pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Passenger {

	private String name;
	private int age;
	private String emailID;
	private int phoneNo;
	private String proofOfID;
	private String dateOfTravel;
	private String timeOfTravel;
	private String baggage;
	private String airlineNo;
	private String bookingNo;
	
	private static final Logger LOGGER = LogManager.getLogger(Passenger.class.getName());

	public String getName() {
		LOGGER.debug(name);
		return name;
	}
	public void setName(String name) {
		LOGGER.debug(name);
		this.name = name;
	}
	public int getAge() {
		LOGGER.debug(age);
		return age;
	}
	public void setAge(int age) {
		LOGGER.debug(age);
		this.age = age;
	}
	public String getEmailID() {
		LOGGER.debug(emailID);
		return emailID;
	}
	public void setEmailID(String emailID) {
		LOGGER.debug(emailID);
		this.emailID = emailID;
	}
	public int getPhoneNo() {
		LOGGER.debug(phoneNo);
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		LOGGER.debug(phoneNo);
		this.phoneNo = phoneNo;
	}
	public String getProofOfID() {
		LOGGER.debug(proofOfID);
		return proofOfID;
	}
	public void setProofOfID(String proofOfID) {
		LOGGER.debug(proofOfID);
		this.proofOfID = proofOfID;
	}
	public String getDateOfTravel() {
		LOGGER.debug(dateOfTravel);
		return dateOfTravel;
	}
	public void setDateOfTravel(String dateOfTravel) {
		LOGGER.debug(dateOfTravel);
		this.dateOfTravel = dateOfTravel;
	}
	public String getTimeOfTravel() {
		LOGGER.debug(timeOfTravel);
		return timeOfTravel;
	}
	public void setTimeOfTravel(String timeOfTravel) {
		LOGGER.debug(timeOfTravel);
		this.timeOfTravel = timeOfTravel;
	}
	public String getBaggage() {
		LOGGER.debug(baggage);
		return baggage;
	}
	public void setBaggage(String baggage) {
		LOGGER.debug(baggage);
		this.baggage = baggage;
	}
	public String getAirlineNo() {
		LOGGER.debug(airlineNo);
		return airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		LOGGER.debug(airlineNo);
		this.airlineNo = airlineNo;
	}
	public String getBookingNo() {
		LOGGER.debug(bookingNo);
		return bookingNo;
	}
	public void setBookingNo(String bookingNo) {
		LOGGER.debug(bookingNo);
		this.bookingNo = bookingNo;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", emailID=" + emailID + ", phoneNo=" + phoneNo
				+ ", proofOfID=" + proofOfID + ", dateOfTravel=" + dateOfTravel + ", timeOfTravel=" + timeOfTravel
				+ ", baggage=" + baggage + ", airlineNo=" + airlineNo + ", bookingNo=" + bookingNo + "]";
	}
	
	
}
