package com.divya.pojos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MedicalCase {

	private String patientID;
	private String doctorID;
	private String caseID;
	private String caseDescription;
	private String caseStartDate;
	private String caseEndDate;
	
	public static final Logger LOGGER= LogManager.getLogger(MedicalCase.class.getName());
	
	public String getPatientID() {
		LOGGER.debug(patientID);
		return patientID;
	}
	public void setPatientID(String patientID) {
		LOGGER.debug(patientID);
		this.patientID = patientID;
	}
	public String getDoctorID() {
		LOGGER.debug(doctorID);
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		LOGGER.debug(doctorID);
		this.doctorID = doctorID;
	}
	public String getCaseID() {
		LOGGER.debug(caseID);
		return caseID;
	}
	public void setCaseID(String caseID) {
		LOGGER.debug(caseID);
		this.caseID = caseID;
	}
	public String getCaseDescription() {
		LOGGER.debug(caseDescription);
		return caseDescription;
	}
	public void setCaseDescription(String caseDescription) {
		LOGGER.debug(caseDescription);
		this.caseDescription = caseDescription;
	}
	public String getCaseStartDate() {
		LOGGER.debug(caseStartDate);
		return caseStartDate;
	}
	public void setCaseStartDate(String caseStartDate) {
		LOGGER.debug(caseStartDate);
		this.caseStartDate = caseStartDate;
	}
	public String getCaseEndDate() {
		LOGGER.debug(caseEndDate);
		return caseEndDate;
	}
	public void setCaseEndDate(String caseEndDate) {
		LOGGER.debug(caseEndDate);
		this.caseEndDate = caseEndDate;
	}
	@Override
	public String toString() {
		return "MedicalCase [patientID=" + patientID + ", doctorID=" + doctorID + ", caseID=" + caseID
				+ ", caseDescription=" + caseDescription + ", caseStartDate=" + caseStartDate + ", caseEndDate="
				+ caseEndDate + "]";
	}
	
	
}
