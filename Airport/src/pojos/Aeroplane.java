package pojos;

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
	
	
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getAirlineNo() {
		return airlineNo;
	}
	public void setAirlineNo(String airlineNo) {
		this.airlineNo = airlineNo;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getCrew() {
		return crew;
	}
	public void setCrew(int crew) {
		this.crew = crew;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimeOfDelay() {
		return timeOfDelay;
	}
	public void setTimeOfDelay(String timeOfDelay) {
		this.timeOfDelay = timeOfDelay;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
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
