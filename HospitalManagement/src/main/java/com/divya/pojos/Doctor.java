package com.divya.pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Doctor {

	private String doctorName;
	private String doctorID;
	private int age;
	private int phoneNumber;
	private String specialisation;
	
	public static final Logger LOGGER = LogManager.getLogger(Doctor.class.getName());
	
	public String getDoctorName() {
		LOGGER.debug(doctorName);
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		LOGGER.debug(doctorName);
		this.doctorName = doctorName;
	}
	public String getDoctorID() {
		LOGGER.debug(doctorID);
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		LOGGER.debug(doctorID);
		this.doctorID = doctorID;
	}
	public String getSpecialisation() {
		LOGGER.debug(specialisation);
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		LOGGER.debug(specialisation);
		this.specialisation = specialisation;
	}
	public int getAge() {
		LOGGER.debug(age);
		return age;
	}
	public void setAge(int age) {
		LOGGER.debug(age);
		this.age = age;
	}
	public int getPhoneNumber() {
		LOGGER.debug(phoneNumber);
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		LOGGER.debug(phoneNumber);
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", doctorID=" + doctorID + ", specialisation=" + specialisation
				+ ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
