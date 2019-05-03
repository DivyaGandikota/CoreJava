package classes;

import java.util.ArrayList;
import java.util.HashMap;

import pojos.Consultation;
import pojos.Doctor;
import pojos.MedicalCase;
import pojos.Patient;

public class HospitalManagement {

	private ArrayList<Patient> patients;
	private ArrayList<Doctor> doctors;
	private ArrayList<MedicalCase> cases;
	private ArrayList<Consultation> consultations;
	private String staff;

//	private String hospitalName;
//	private String hospitalLocation;
	
	private HashMap<String,String> hospitalInfo;
	
	public HashMap<String,String> getHospitalInfo() {
		return hospitalInfo;
	}

	public void setHospitalInfo(String hospitalName,String hospitalLocation) {
		this.hospitalInfo.put(hospitalName, hospitalLocation);
	}
	
	
	public HospitalManagement() {
		patients=new ArrayList<Patient>();
		doctors = new ArrayList<Doctor>();
		cases= new ArrayList<MedicalCase>();
		consultations = new ArrayList<Consultation>();
		
		hospitalInfo= new HashMap<String,String>();
	}
	
	@Override
	public String toString() {
		return "HospitalManagement [patients=" + patients + ", doctors=" + doctors + ", cases=" + cases
				+ ", consultations=" + consultations + ", staff=" + staff + ", hospitalInfo=" + hospitalInfo + "]";
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<MedicalCase> getCases() {
		return cases;
	}

	public void setCases(ArrayList<MedicalCase> cases) {
		this.cases = cases;
	}

	/*public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}*/

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public boolean checkPatient(String name) {
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getPatientName().equalsIgnoreCase(name))
				return true;
		}
		return false;
	}
	
	public void addPatient(String name, int age,String patientID,int phonenumber, String medicalHistory, String insurance) {
		
		Patient patient =new Patient();
		
		if(!checkPatient(name)) {
			
			patient.setPatientName(name);
			patient.setPatientAge(age);
			patient.setPatientID(patientID);
			patient.setPhonenumber(phonenumber);
			patient.setMedicalHistory(medicalHistory);
			patient.setInsurance(insurance);
			
			patients.add(patient);
			System.out.println(patient);
		}
		else {
			System.out.println(name+" :name already exists");
		}
	//	System.out.println(patients.size());
	}
	
	public void updatePatientMedicalHistory(String patientID, String medicalHistory) {
		boolean count=false;
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getPatientID().equalsIgnoreCase(patientID)) {
				patients.get(i).setMedicalHistory(medicalHistory);
				count=true;
			}
		}
		if(count) {
			System.out.println("Updated Medical History");
		}
		else {
			System.out.println("No records found against patientID");
		}
	}
	
	public boolean checkDoctor(String doctorName) {
		for(int i=0;i<doctors.size();i++) {
			if(doctors.get(i).getDoctorName().equalsIgnoreCase(doctorName))
				return true;
		}
		return false;
	}
	public void addDoctor(String doctorName,String doctorID, String specialisation, int age, int phoneNumber) {
		
		Doctor doctor=new Doctor();
		if(!checkDoctor(doctorName)) {
		doctor.setDoctorName(doctorName);
		doctor.setDoctorID(doctorID);
		doctor.setSpecialisation(specialisation);
		doctor.setAge(age);
		doctor.setPhoneNumber(phoneNumber);
		
		doctors.add(doctor);
		
		System.out.println(doctor);
		}
		else
			System.out.println("Doctor already exists");
		
	}
	private boolean checkPatientID(String patientID) {
		
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getPatientID().equalsIgnoreCase(patientID))
				return true;
		}
		System.out.println("Patient does not exist");
		return false;
	}
	
	private boolean checkDoctorID(String doctorID) {
		
		for(int i=0;i<doctors.size();i++) {
			if(doctors.get(i).getDoctorID().equalsIgnoreCase(doctorID))
				return true;
		}
		System.out.println("Doctor does not exist");
		return false;
		
	}
	public void addMedicalCase(String caseID, String patientID, String doctorID, String caseDescription, String caseStartDate, String caseEndDate) {
		
		MedicalCase medicalCase=new MedicalCase();
		
		if(checkPatientID(patientID) && checkDoctorID(doctorID)) {
		
			medicalCase.setCaseID(caseID);
			medicalCase.setPatientID(patientID);
			medicalCase.setDoctorID(doctorID);
			medicalCase.setCaseDescription(caseDescription);
			medicalCase.setCaseStartDate(caseStartDate);
			medicalCase.setCaseEndDate(caseEndDate);
			
			cases.add(medicalCase);
			System.out.println(medicalCase);
		}
		else
			System.out.println("Patient ID or Doctor ID does not exist");
	}
	public Patient getPatientByID(String patientID) {
		
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getPatientID().equalsIgnoreCase(patientID)) {
				System.out.println(patients.get(i).toString());
				return patients.get(i);
			}
		}
		System.out.println("Given Patient ID doesn't exist");
		return null;
	}
	public boolean getPatientByName(String patientName) {
		
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).getPatientName().equalsIgnoreCase(patientName)) {
				System.out.println(patients.get(i).toString());
				return true;
			}
		}
		System.out.println("Given Patient name doesn't exist");
		return false;
	}
	public Doctor getDoctorByID(String doctorID) {
		
		for(int i=0;i<doctors.size();i++) {
			if(doctors.get(i).getDoctorID().equalsIgnoreCase(doctorID)) {
				//System.out.println(doctors.get(i).toString());
				//return true;
				return doctors.get(i);
			}
		}
		System.out.println("Given Doctor ID doesn't exist");
		//return false;
		return null;
	}
	
	public boolean getDoctorByName(String doctorName) {
		for(int i=0;i<doctors.size();i++) {
			if(doctors.get(i).getDoctorName().equalsIgnoreCase(doctorName)) {
				System.out.println(doctors.get(i).toString());
				return true;
			}

		}
		System.out.println("Given Doctor Name doesn't exist");
		return false;
	}
	public MedicalCase getMedicalCaseByID(String caseID) {
		
		for(int i=0;i<cases.size();i++) {
			if(cases.get(i).getCaseID().equalsIgnoreCase(caseID)) {
				//System.out.println(cases.get(i).toString());
				return cases.get(i);
			}
		}
		System.out.println("Given Case ID doesn't exist");
		return null;
	}

	public boolean checkCaseID(String caseID) {
		for(int i=0;i<cases.size();i++) {
			if(cases.get(i).getCaseID().equalsIgnoreCase(caseID)) {
				return true;
			}
		}
		System.out.println("Case ID doesn't exist");
		return false;
	}
	public void addConsultation(String consultationID, String caseID,String appointmentTime, String followUpDate) {
		Consultation consultation=new Consultation();
		
		if(checkCaseID(caseID)) {
			consultation.setConsultationID(consultationID);
			consultation.setCaseID(caseID);
			consultation.setAppointmentTime(appointmentTime);
			consultation.setFollowUpDate(followUpDate);
			
			consultations.add(consultation);  
			System.out.println(consultation);
		}
		else
			System.out.println("Patient doesn't exist");
	}
	public Consultation getConsultation(String consultationID) {
		
		for(int i=0;i<consultations.size();i++) {
			if(consultations.get(i).getConsultationID().equalsIgnoreCase(consultationID)) {
			//	Consultation consultation = consultations.get(i);
			//	System.out.println(consultations.get(i).toString());
			//	return consultation;
				return consultations.get(i);
			}
		}
		System.out.println("Case ID doesn't exist to add consultation");
		return null;
	}
	
	public boolean checkConsultationID(String consultationID) {
		for(int i=0;i<consultations.size();i++) {
			if(consultations.get(i).getCaseID().equalsIgnoreCase(consultationID)) {
				return true;
			}
		}
		System.out.println("Consultation ID doesn't exist");
		return false;
	}
	public void getConsultationPatientDoctorCaseDetails(String consultationID) {
		
		Consultation consultation=getConsultation(consultationID);
		
		System.out.println(consultation);
	//	System.out.println(getMedicalCaseByID(consultation.getCaseID()));
		
		MedicalCase medicalCase = getMedicalCaseByID(consultation.getCaseID());
		System.out.println(medicalCase);
		
		Patient patient= getPatientByID(medicalCase.getPatientID());
		System.out.println(patient);
		
		Doctor doctor = getDoctorByID(medicalCase.getDoctorID());
		System.out.println(doctor);
				
	}

	
	
	//if-else statments
	//preconditions like checkPatientID -( do not add same patient)
	//more test cases
	//implement consultation
	//read and follow code based on code execution
}
