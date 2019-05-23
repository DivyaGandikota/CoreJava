package com.divya.pojos;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Consultation {
	
	private String consultationID;
	private String caseID;
	private String appointmentTime;
	private String followUpDate;
	
	public static final Logger LOGGER =  LogManager.getLogger(Consultation.class.getName());
	
	public String getConsultationID() {
		LOGGER.debug(consultationID);
		return consultationID;
	}
	public void setConsultationID(String consultationID) {
		LOGGER.debug(consultationID);
		this.consultationID = consultationID;
	}
	public String getCaseID() {
		LOGGER.debug(caseID);
		return caseID;
	}
	public void setCaseID(String caseID) {
		LOGGER.debug(caseID);
		this.caseID = caseID;
	}
	public String getAppointmentTime() {
		LOGGER.debug(appointmentTime);
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		LOGGER.debug(appointmentTime);
		this.appointmentTime = appointmentTime;
	}
	public String getFollowUpDate() {
		LOGGER.debug(followUpDate);
		return followUpDate;
	}
	public void setFollowUpDate(String followUpDate) {
		LOGGER.debug(followUpDate);
		this.followUpDate = followUpDate;
	}
	@Override
	public String toString() {
		return "Consultation [consultationID=" + consultationID + ", caseID=" + caseID + ", appointmentTime="
				+ appointmentTime + ", followUpDate=" + followUpDate + "]";
	}
	
}
