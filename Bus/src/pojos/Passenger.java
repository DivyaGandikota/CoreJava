package pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Passenger {

	private String id;
	private String name;
	private String age;
	private String gender;
	private String phoneNo;
	
	private static final Logger LOGGER=LogManager.getLogger(Passenger.class.getName());

	
	public String getAge() {
		LOGGER.debug(age);
		return age;
	}
	public void setAge(String age) {
		LOGGER.debug(age);
		this.age = age;
	}
	public String getName() {
		LOGGER.debug(name);
		return name;
	}
	public void setName(String name) {
		LOGGER.debug(name);
		this.name = name;
	}
	public String getGender() {
		LOGGER.debug(gender);
		return gender;
	}
	public void setGender(String gender) {
		LOGGER.debug(gender);
		this.gender = gender;
	}
	public String getId() {
		LOGGER.debug(id);
		return id;
	}
	public void setId(String id) {
		LOGGER.debug(id);
		this.id = id;
	}
	public String getPhoneNo() {
		LOGGER.debug(phoneNo);
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		LOGGER.debug(phoneNo);
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Passenger [age=" + age + ", name=" + name + ", Gender=" + gender + ", id=" + id + ", PhoneNo="
				+ phoneNo + "]";
	}
	

	
}
