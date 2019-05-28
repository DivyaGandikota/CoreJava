package pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ticket {

	private String ticketID;
	private double cost;
	private boolean isIssued;
	private String busNo;
	private String passengerID;
//	private String driverID;
	
	private static final Logger LOGGER = LogManager.getLogger(Ticket.class.getName());
	
	public String getTicketID() {
		LOGGER.debug(ticketID);
		return ticketID;
	}
	public void setTicketID(String ticketID) {
		LOGGER.debug(ticketID);
		this.ticketID = ticketID;
	}
	public double getCost() {
		LOGGER.debug(cost);
		return cost;
	}
	public void setCost(double cost) {
		LOGGER.debug(cost);
		this.cost = cost;
	}
	public boolean getIsIssued() {
		LOGGER.debug(isIssued);
		return isIssued;
	}
	public void setIsIssued(boolean isIssued) {
		LOGGER.debug(isIssued);
		this.isIssued = isIssued;
	}
	public String getBusNo() {
		LOGGER.debug(busNo);
		return busNo;
	}
	public void setBusNo(String busNo) {
		LOGGER.debug(busNo);
		this.busNo = busNo;
	}
	public String getPassengerID() {
		LOGGER.debug(passengerID);
		return passengerID;
	}
	public void setPassengerID(String passengerID) {
		LOGGER.debug(passengerID);
		this.passengerID = passengerID;
	}
	/*public String getDriverID() {
		return driverID;
	}
	public void setDriverID(String driverID) {
		this.driverID = driverID;
	}*/
	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", cost=" + cost + ", isIssued=" + isIssued + ", busNo=" + busNo
				+ ", passengerID=" + passengerID+ "]";
	}
	
}
