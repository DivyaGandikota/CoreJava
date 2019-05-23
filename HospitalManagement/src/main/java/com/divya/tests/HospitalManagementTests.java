package com.divya.tests;

import com.divya.classes.HospitalManagement;

public class HospitalManagementTests {
	
	public static void main(String[] args) {
		
		HospitalManagement test = new HospitalManagement();
		
		
		test.addPatient("Patient001", 28, "PatientID001", 123456, "NA", "145");
		test.addPatient("Patient002", 27, "PatientID002", 235, "NA", "233");
		
		//test.addPatient("Divya", 24, "333", 98765, "NA", "432");
		
		test.addDoctor("Doctor001", "DoctorID001", "PCP", 34, 456);
		test.addDoctor("Doctor002", "DoctorID002", "Physician", 44, 1234566);
		
	//	test.addDoctor("A", "1", "PCP", 34, 456); //duplicate

		
		test.addMedicalCase("Case001", "PatientID001", "DoctorID001", "NA", "10/2/2019", "10/2/2019");
		test.addMedicalCase("Case002", "PatientID002", "DoctorID002", "NA", "10/2/2019", "10/2/2019");
		
		/*test.getPatientByID("123");
		test.getDoctorByID("2");

		test.getPatientByName("Sim");
		
		test.getConsultation("consultation001");
		*/
		test.addConsultation("consultation001","Case001", "02.00", "10/2/2019");

		test.getConsultationPatientDoctorCaseDetails("consultation001");
		
	//	test.getConsultation("Sim", "001");

		/*test.addMedicalCase("003", "444", "1", "NA", "10/2/2019", "10/2/2019");
		test.addMedicalCase("004", "123", "3", "NA", "10/2/2019", "10/2/2019");
		test.addMedicalCase("005", "444", "4", "NA", "10/2/2019", "10/2/2019");


		
		
		test.getPatientByName("Divya");
		test.getDoctorByName("A");
		
		test.getCaseID("001");
		test.getCaseID("003");
		
		test.updateConsultation("001","Divya", "02.00", "10/2/2019");
		*/
		
		test.setHospitalInfo("ABC Hospital", "X Location");
		
		System.out.println(test.toString());
		
		test.updatePatientMedicalHistory("PatientID001","High BP");
		test.getPatientByID("PatientID001");
	}

}
