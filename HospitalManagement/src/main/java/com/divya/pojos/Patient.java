package com.divya.pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Patient {
	
	private String patientName;
	private int patientAge;
	private String patientID;
	private int phonenumber;
	private String medicalHistory;
	private String insurance;

	public static final Logger LOGGER = LogManager.getLogger(Patient.class.getName());
	
	public String getPatientName() {
		LOGGER.debug(patientName);
		return patientName;
	}
	public void setPatientName(String patientName) {
		LOGGER.debug(patientName);
		this.patientName = patientName;
	}
	public int getPatientAge() {
		LOGGER.debug(patientAge);
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		LOGGER.debug(patientAge);
		this.patientAge = patientAge;
	}
	public String getPatientID() {
		LOGGER.debug(patientID);
		return patientID;
	}
	public void setPatientID(String patientID) {
		LOGGER.debug(patientID);
		this.patientID = patientID;
	}
	public int getPhonenumber() {
		LOGGER.debug(phonenumber);
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		LOGGER.debug(phonenumber);
		this.phonenumber = phonenumber;
	}
	public String getMedicalHistory() {
		LOGGER.debug(medicalHistory);
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		LOGGER.debug(medicalHistory);
		this.medicalHistory = medicalHistory;
	}
	public String getInsurance() {
		LOGGER.debug(insurance);
		return insurance;
	}
	public void setInsurance(String insurance) {
		LOGGER.debug(insurance);
		this.insurance = insurance;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientAge=" + patientAge + ", patientID=" + patientID
				+ ", phonenumber=" + phonenumber + ", medicalHistory=" + medicalHistory + ", insurance=" + insurance
				+ "]";
	}
	
	

}
