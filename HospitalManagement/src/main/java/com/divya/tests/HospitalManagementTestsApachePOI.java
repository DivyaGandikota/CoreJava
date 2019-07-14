package com.divya.tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.divya.classes.HospitalManagement;


public class HospitalManagementTestsApachePOI {
	
    private static final Logger LOGGER1 = LogManager.getLogger(HospitalManagementTestsApachePOI.class.getName());// LoggerExample.testLogger(HospitalManagement.class);

 
	public static void main(String[] args) throws IOException, InvalidFormatException {
		
	//	LoggerExample.testLogger(HospitalManagementTestsApachePOI.class);

		HospitalManagement test = new HospitalManagement();

	//	LoggerExample.LOGGER.info("IN HospitalManagementTestsApachePOI");
		
		LOGGER1.info("IN HospitalManagementTestsApachePOI");
	//	File f = new File("resources/Database.xlsx");
		
	//	FileInputStream fis = new FileInputStream(f);
//		LOGGER1.debug(f.getAbsolutePath());
		
		InputStream fis = HospitalManagementTestsApachePOI.class.getResourceAsStream("/Database.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		System.out.println("%%%");
		HashMap<String, String> patient;
		ArrayList<HashMap<String, String>> patientarray = new ArrayList<HashMap<String, String>>();
		try { // reading data from excel for Patients
			 // Workbook
			XSSFSheet sheet = wb.getSheet("Patient"); // Sheet name
			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) { // row count
				patient = new HashMap<String, String>(); // Initialize
				for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) { // cell count
					String key = sheet.getRow(0).getCell(j).toString(); // Key is header
					String value = sheet.getRow(i).getCell(j).toString(); // Value in the cell
					patient.put(key, value); // key and value - map to hashmap
				}
				patientarray.add(patient); // add hashmap object to array object
			}

			for (int i = 0; i < patientarray.size(); i++) {
				patient = new HashMap<String, String>(); // Initialize
				patient = patientarray.get(i); // Get Hashmap from array location

				/*
				 * Iterator<String> itr = patient.keySet().iterator(); while (itr.hasNext()) {
				 * String key = itr.next(); System.out.println(key + "\t" +
				 * patient.get(key).toString() + "\t"); }
				 */

				// Getting values from key using hashmap.get()
				String patientName = patient.get("PatientName");
				int age = Integer.parseInt(patient.get("Age"));
				String id = patient.get("ID");
				int phoneNo = Integer.parseInt(patient.get("PhoneNumber"));
				String medicalHistory = patient.get("MedicalHistory");
				String insurance = patient.get("Insurance");

				// Passing arguments to method.
				test.addPatient(patientName, age, id, phoneNo, medicalHistory, insurance);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<String, String> doctor;
		ArrayList<HashMap<String, String>> doctorarray = new ArrayList<HashMap<String, String>>();

		try { // reading excel for doctor details
			
			XSSFSheet sheet = wb.getSheet("Doctor");

			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
				
				doctor = new HashMap<String, String>();

				for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {

					String key = sheet.getRow(0).getCell(j).toString();
					String value = sheet.getRow(i).getCell(j).toString();

					doctor.put(key, value);
				}
				doctorarray.add(doctor);
			}

			for (int i = 0; i < doctorarray.size(); i++) {

				doctor = new HashMap<String, String>();

				doctor = doctorarray.get(i);

				String doctorName = doctor.get("DoctorName");

				String doctorID = doctor.get("DoctorID");

				String specialisation = doctor.get("Specialisation");

				int age = Integer.parseInt(doctor.get("Age"));

				int phoneNumber = Integer.parseInt(doctor.get("PhoneNumber"));
				test.addDoctor(doctorName, doctorID, specialisation, age, phoneNumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<String, String> medicalCase;
		ArrayList<HashMap<String, String>> medicalCaseArray = new ArrayList<HashMap<String, String>>();

		try {
		
			XSSFSheet sheet = wb.getSheet("MedicalCase");
			
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				medicalCase = new HashMap<String,String>();
				
				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
					
					String key=sheet.getRow(0).getCell(j).toString();
					String value = sheet.getRow(i).getCell(j).toString();
					
					medicalCase.put(key, value);
				}
				medicalCaseArray.add(medicalCase);
			}
			for(int i=0;i<medicalCaseArray.size();i++) {
				medicalCase = new HashMap<String,String>();
				medicalCase = medicalCaseArray.get(i);
				
				String caseID = medicalCase.get("CaseID");
				String patientID= medicalCase.get("PatientID");
				String doctorID= medicalCase.get("DoctorID");
				String caseDescription= medicalCase.get("CaseDescription");
				String caseStartDate= medicalCase.get("CaseStartDate");
				String caseEndDate= medicalCase.get("CaseEndDate");
				
				test.addMedicalCase(caseID, patientID, doctorID, caseDescription, caseStartDate, caseEndDate);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		HashMap<String, String> consultation;
		ArrayList<HashMap<String, String>> consultationArray = new ArrayList<HashMap<String, String>>();

		try {
			
			XSSFSheet sheet = wb.getSheet("Consultation");
			
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				consultation = new HashMap<String,String>();
				
				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
					
					String key=sheet.getRow(0).getCell(j).toString();
					String value = sheet.getRow(i).getCell(j).toString();
					
					consultation.put(key, value);
				}
				consultationArray.add(consultation);
			}
			for(int i=0;i<consultationArray.size();i++) {
				consultation = new HashMap<String,String>();
				consultation = consultationArray.get(i);
				
				String consultationID = consultation.get("ConsultationID");
				String caseID= consultation.get("CaseID");
				String appointmentTime= consultation.get("AppointmentTime");
				String followUpDate= consultation.get("FollowUpDate");
				
				test.addConsultation(consultationID, caseID, appointmentTime, followUpDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		HashMap<String, String> updateMedicalHistory;
		ArrayList<HashMap<String, String>> updateMedicalHistoryArray = new ArrayList<HashMap<String, String>>();

		try {
			
			XSSFSheet sheet = wb.getSheet("UpdateMedicalHistory");
			
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++) {
				updateMedicalHistory = new HashMap<String,String>();
				
				for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++) {
					
					String key=sheet.getRow(0).getCell(j).toString();
					String value = sheet.getRow(i).getCell(j).toString();
					
					updateMedicalHistory.put(key, value);
				}
				updateMedicalHistoryArray.add(updateMedicalHistory);
			}
			for(int i=0;i<updateMedicalHistoryArray.size();i++) {
				updateMedicalHistory = new HashMap<String,String>();
				updateMedicalHistory = updateMedicalHistoryArray.get(i);
				
				String patientID = updateMedicalHistory.get("PatientID");
				String medicalHistory= updateMedicalHistory.get("MedicalHistory");
			
				test.updatePatientMedicalHistory(patientID, medicalHistory);
				test.getPatientByID(patientID);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		wb.close();
	}
}
