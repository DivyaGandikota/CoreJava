package pojos;

public class Patient {
	
	private String patientName;
	private int patientAge;
	private String patientID;
	private int phonenumber;
	private String medicalHistory;
	private String insurance;

	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientAge=" + patientAge + ", patientID=" + patientID
				+ ", phonenumber=" + phonenumber + ", medicalHistory=" + medicalHistory + ", insurance=" + insurance
				+ "]";
	}
	
	

}
