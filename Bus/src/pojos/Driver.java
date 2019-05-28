package pojos;

public class Driver {

	private String driverID;
	//private ArrayList<String> tickets;
	
	public String getDriverID() {
		return driverID;
	}
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}
	/*public ArrayList<String> getTickets() {
		return tickets;
	}
	public void setTickets(ArrayList<String> tickets) {
		this.tickets = tickets;
	}*/
	@Override
	public String toString() {
		return "Driver [driverID=" + driverID +"]";
	}
	
}
