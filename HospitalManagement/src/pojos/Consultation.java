package pojos;

public class Consultation {
	
	private String consultationID;
	private String caseID;
	private String appointmentTime;
	private String followUpDate;
	
	
	public String getConsultationID() {
		return consultationID;
	}
	public void setConsultationID(String consultationID) {
		this.consultationID = consultationID;
	}
	public String getCaseID() {
		return caseID;
	}
	public void setCaseID(String caseID) {
		this.caseID = caseID;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(String followUpDate) {
		this.followUpDate = followUpDate;
	}
	@Override
	public String toString() {
		return "Consultation [consultationID=" + consultationID + ", caseID=" + caseID + ", appointmentTime="
				+ appointmentTime + ", followUpDate=" + followUpDate + "]";
	}
	
}
