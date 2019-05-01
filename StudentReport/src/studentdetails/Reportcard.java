package studentdetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reportcard {

	Student s = new Student();
	CurriculumSem curriculum = new CurriculumSem();
	Semester sem = new Semester();
	
	public Student getStudent() {
		return this.s;
	}
	

	public CurriculumSem getCurriculumSem() {
		return this.curriculum;
	}

	public Semester getSemester() {
		return this.sem;
	}

	public void studDetails() {

		Calculator calc = new Calculator();
		int total = 0;
		int percentage=0;
		int sum=0;
		System.out.println("Student details:");
		System.out.println("Name: " + getStudent().getName() + " Age: " + getStudent().getAge());
		System.out.println(getStudent().getAddress().toString());
		System.out.println();
		System.out.println(
				"Subject Code" + "\t" + "MarksScored" + "\t" + "Faculty Name" + "\t Subject Name \t Maximum Marks");
		for (int i = 0; i < getSemester().getSubjectcode().size(); i++) {
			System.out.print(getSemester().getSubjectcode().get(i) + "\t\t" + getStudent().getMarksList().get(i) + "\t\t"
					+ getSemester().getFacultyNameList().get(i) + "\t\t");

			for (int j = 0; j < getCurriculumSem().getSubjectCodeListCurriculum().size(); j++) {
				if (getSemester().getSubjectcode().get(i)
						.equalsIgnoreCase(getCurriculumSem().getSubjectCodeListCurriculum().get(j))) {
					System.out.println(getCurriculumSem().getSubjectNameListCurriculum().get(j) + "\t\t"
							+ getCurriculumSem().getMaxMarksList().get(j));
					int maxi = getCurriculumSem().getMaxMarksList().get(j);
					total = total + maxi;
					}
			}
			System.out.println();
			
		}
		sum=calc.sum(getStudent().getMarksList()) ;	
		System.out.println("Total Marks Obtained" + "\t\t" + sum + "\t\t" + total);

		percentage = calc.percentage(getStudent().getMarksList(), total);
		System.out.println("Percentage" + "\t\t" + percentage + "\t\t" + "100%");
		grade(percentage);
		
		System.out.println("*********************************");
		
	}

	public void setAddressForStudent(String houseNo, String streetname, String cityname, String statename,
			int zipcode) {
		Address address = new Address();
		address.setHouseNo(houseNo);
		address.setStreetName(streetname);
		address.setCityName(cityname);
		address.setStateName(statename);
		address.setZipcode(zipcode);
		s.setAddress(address);
	}

	public void setStudentDetails(String name, int age, ArrayList<Integer> markslist) {
		s.setName(name);
		s.setAge(age);
		s.setMarksList(markslist);
	}

	public void grade(int percentage) {

		try {
			if (percentage >= 80) {
				System.out.println("Grade \t\t" + "A" + "\t\t" + "A");
			} else if (percentage >= 60 && percentage < 80) {
				System.out.println("Grade \t\t" + "B" + "\t\t" + "A");
			} else if (percentage >= 40 && percentage < 60) {
				System.out.println("Grade \t\t" + "C" + "\t\t" + "A");
			} else if (percentage < 40) {
				System.out.println("Grade \t\t" + "Fail" + "\t\t" + "A");
			} else {
				System.err.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	public void setCurriculumSemDetails() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Subject Names, Subject Codes and Max Marks:");
		String subjectname = "";
		ArrayList<String> subjectnamelistcurriculum = new ArrayList<String>();
		ArrayList<String> subjectcodelistcurriculum = new ArrayList<String>();
		ArrayList<Integer> maxmarkslist = new ArrayList<Integer>();
		while (true) {
			System.out.println("Enter Subject Names:");
			subjectname = br.readLine();
			if (subjectname.equals("stop"))
				break;
			subjectnamelistcurriculum.add(subjectname);
			System.out.println("Enter Subject Code:");
			subjectcodelistcurriculum.add(br.readLine()); // append to list.

			System.out.println("Enter Maximum Marks");
			maxmarkslist.add(Integer.parseInt(br.readLine()));
		}
		curriculum.setSubjectNameListCurriculum(subjectnamelistcurriculum);
		curriculum.setSubjectCodeListCurriculum(subjectcodelistcurriculum);
		curriculum.setMaxMarksList(maxmarkslist);

	}

	public void setSemester() throws IOException {


		ArrayList<String> subjectcodelist = new ArrayList<String>();
		ArrayList<String> facultynamelist = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String subjectcode = "";
		while (true) {
			System.out.println("Enter Subject Code - Faculty Name:");
			subjectcode = br.readLine();
			if (subjectcode.equalsIgnoreCase("stop"))
				break;

			if (getCurriculumSem().getSubjectCodeListCurriculum().contains(subjectcode)) {
				subjectcodelist.add(subjectcode);
				System.out.println("Enter Faculty Name:");
				String faculty = br.readLine();
				facultynamelist.add(faculty);
			} else {
				System.out.println("Given Subject Code doesn't exist");
			}
		}
		sem.setSubjectcode(subjectcodelist);
		sem.setFacultyNameList(facultynamelist);
		
	}

	public void setStudent() throws IOException {

	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> markslist = new ArrayList<Integer>();
		String name ="";
		while (true) {
			
			System.out.println("Student Details:");
			System.out.println("Enter Name");
			name = br.readLine();
			if (name.equalsIgnoreCase("stop"))
				break;
			System.out.println("Enter Age");
			int age = Integer.parseInt(br.readLine());

			int marks = 0;
			System.out.println("Enter marks");

			for (int i = 0; i < getSemester().getSubjectcode().size(); i++) {
				marks = Integer.parseInt(br.readLine());
				if (marks < 0)
					break;
				markslist.add(marks);
			}
			setStudentDetails(name, age, markslist);
			System.out.println("Enter Address: ");
			String houseNo = br.readLine();
			String streetname = br.readLine();
			String cityname = br.readLine();
			String statename = br.readLine();
			int zipcode = Integer.parseInt(br.readLine());
			setAddressForStudent(houseNo, streetname, cityname, statename, zipcode);
		}
	}

	public static void main(String[] args) throws IOException {

		Reportcard report = new Reportcard();
		ArrayList<Student> studentlist = new ArrayList<Student>();

		report.setCurriculumSemDetails();

		report.setSemester();
		
		report.setStudent();
		
		studentlist.add(report.getStudent());
			
		report.studDetails();
	}

}
