package pojos;

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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getProofOfID() {
		return proofOfID;
	}
	public void setProofOfID(String proofOfID) {
		this.proofOfID = proofOfID;
	}
	public String getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public String getTimeOfTravel() {
		return timeOfTravel;
	}
	public void setTimeOfTravel(String timeOfTravel) {
		this.timeOfTravel = timeOfTravel;
	}
	public String getBaggage() {
		return baggage;
	}
	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}
	public String getAirlineNo() {
		return airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		this.airlineNo = airlineNo;
	}
	public String getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", emailID=" + emailID + ", phoneNo=" + phoneNo
				+ ", proofOfID=" + proofOfID + ", dateOfTravel=" + dateOfTravel + ", timeOfTravel=" + timeOfTravel
				+ ", baggage=" + baggage + ", airlineNo=" + airlineNo + ", bookingNo=" + bookingNo + "]";
	}
	
	
}
