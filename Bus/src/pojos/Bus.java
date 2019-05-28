package pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bus {
	
	private String busNo;
	private int busCapacity;
	
	private static final Logger LOGGER=LogManager.getLogger(Bus.class.getName());

	public String getBusNo() {
		LOGGER.debug(busNo);
		return busNo;
	}
	public void setBusNo(String busNo) {
		LOGGER.debug(busNo);
		this.busNo = busNo;
	}
	public int getBusCapacity() {
		LOGGER.debug(busCapacity);
		return busCapacity;
	}
	public void setBusCapacity(int busCapacity) {
		LOGGER.debug(busCapacity);
		this.busCapacity = busCapacity;
	}
	
}
