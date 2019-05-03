package pojos;

public class MedicalCase {

	private String patientID;
	private String doctorID;
	private String caseID;
	private String caseDescription;
	private String caseStartDate;
	private String caseEndDate;
	
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public String getCaseID() {
		return caseID;
	}
	public void setCaseID(String caseID) {
		this.caseID = caseID;
	}
	public String getCaseDescription() {
		return caseDescription;
	}
	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}
	public String getCaseStartDate() {
		return caseStartDate;
	}
	public void setCaseStartDate(String caseStartDate) {
		this.caseStartDate = caseStartDate;
	}
	public String getCaseEndDate() {
		return caseEndDate;
	}
	public void setCaseEndDate(String caseEndDate) {
		this.caseEndDate = caseEndDate;
	}
	@Override
	public String toString() {
		return "MedicalCase [patientID=" + patientID + ", doctorID=" + doctorID + ", caseID=" + caseID
				+ ", caseDescription=" + caseDescription + ", caseStartDate=" + caseStartDate + ", caseEndDate="
				+ caseEndDate + "]";
	}
	
	
}
