package studentdetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Reportcard {
	
	Student s=new Student(); //,s1,s2;
	ArrayList<HashMap<String,String>> subject = new ArrayList<HashMap<String,String>>();

	
	public Student getStudent() {
		return this.s;
	}

	public void studDetails() {
		
		Calculator calc=new Calculator();
		int total=0;
		int percentage;
		String name = s.getName();
		int age = s.getAge();
	//	String facultyname=s.getCuricculum().getFacultyname();
	//	int maxmarks=s.getCuricculum().getMaxmarks();
		System.out.println("Student details:");	
		System.out.println("Name: " +name+ " Age: "+age);
		System.out.println(s.getAddress().toString());
		System.out.println("Subject" + "\t\t" + "MarksScored" + "\t" + "MaxMarks" +"\n" );
			
		/*for(int i=0;i<s.getCuricculum().getSubjectNameList().size();i++) {
			System.out.println(s.getCuricculum().getSubjectNameList().get(i) + "\t\t" + s.getMarksList().get(i) + "\t\t" + maxmarks);
			total = maxmarks+total;
		}*/
	//	ArrayList<String> x=s.getSemester().getCurriculumSem().getSubjectNameListCurriculum();
		
		/*for(int i=0;i<s.getMarksList().size();i++) {
			System.out.println(s.getSemester().getCurriculumSem().getSubject().get(i)+ "\t\t" + s.getMarksList().get(i)+ "\t" +s.getSemester().getCurriculumSem().getMaxMarksList().get(i));
			int maxi=+s.getSemester().getCurriculumSem().getMaxMarksList().get(i);
			total=total+maxi;
		}*/
		
		for(int i=0;i<s.getMarksList().size();i++) {
			for(Map.Entry<String, String> entry:subject.get(i).entrySet()) {
			
				System.out.println(entry.getKey()  +"\t"+s.getMarksList().get(i) + "\t" + s.getSemester().getCurriculumSem().getMaxMarksList().get(i));
				
			}
			int maxi=+s.getSemester().getCurriculumSem().getMaxMarksList().get(i);
			total=total+maxi;
		}
		
		System.out.println();
		
	//	total=calc.sum(s.getSemester().getCurriculumSem().getMaxMarksList());
		System.out.println("Total" + "\t\t" + calc.sum(s.getMarksList()) + "\t\t" + total);
		
		percentage=calc.percentage(s.getMarksList(), total);			
		System.out.println("Percentage" +"\t"+ percentage + "\t\t" + "100%" +"\n");
		grade(percentage);
		System.out.println("*********************************");
		
		
		
	}
	public void setAddressForStudent(String houseNo,String streetname, String cityname, String statename, int zipcode) {
		Address address=new Address();
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
				if(percentage>= 80) {
					System.out.println("Grade \t\t" + "A" + "\t\t" + "A");
				}else if(percentage>=60 && percentage<80){
					System.out.println("Grade \t\t" + "B" + "\t\t" + "A");
				}else if(percentage>=40 && percentage<60) {
					System.out.println("Grade \t\t" + "C" + "\t\t" + "A");
				}else if(percentage<40) {
					System.out.println("Grade \t\t" + "Fail" + "\t\t" + "A");
				}else {
					System.err.println("Error");
				}
			 	}
			catch(Exception e) {
				System.out.println("Error");
			}
	}
	
	//Subject Code and Name - Curriculum and Semester details.
	
	
	public void setSemesterForStudent(String subjectname, String subjectcode, ArrayList<String> facultynamelist, ArrayList<Integer> maxmarkslist) {
		Semester sem=new Semester();
		sem.setFacultyNameList(facultynamelist);
		
		CurriculumSem c=new CurriculumSem();
	//	c.setSubjectNameListCurriculum(subjectnamelistcurriculum);
	//	c.setSubjectCodeListCurriculum(subjectcodelistcurriculum);
		
		c.setMaxMarksList(maxmarkslist);
		sem.setCurriculuSem(c);
		s.setSemester(sem);
		System.out.println("Semester details: \nSubject Name \t Subject Code \t Faculty Name \t Maximum Marks \n");
		
		
		for(int i=0;i<subject.size();i++) {
			for(Map.Entry<String, String> entry:subject.get(i).entrySet()) {
			
				System.out.println(entry.getKey() + "\t" + entry.getValue() +"\t"+facultynamelist.get(i) + "\t" + maxmarkslist.get(i));
			}
		}
		
		
		/*for(int i=0;i<subjectname.size();i++) {
			System.out.println(subjectname.get(i) +"\t\t"+ subjectcode.get(i) + "\t\t"+ facultynamelist.get(i) + "\t" + maxmarkslist.get(i));
		}*/
	}
	
	private void addData(String subjectname, String subjectcode) {
		HashMap<String,String> hash=new HashMap<>();
		hash.put(subjectname, subjectcode);
		subject.add(hash);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Reportcard report= new Reportcard();
		
		ArrayList<Student> studentlist=new ArrayList<Student>();
		
		//Taking Inputs from user
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Enter Curriculum details
		System.out.println("Enter Subject Names, Subject Codes and Max Marks:");
		String subjectname="";
		String subjectcode="";
	//	ArrayList<String> subjectnamelistcurriculum = new ArrayList<String>();
	//	ArrayList<String> subjectcodelistcurriculum = new ArrayList<String>();
		
		
		ArrayList<Integer> maxmarkslist = new ArrayList<Integer>();
		while(true) {
			System.out.println("Enter Subject Names:");
			subjectname=br.readLine();
			if(subjectname.equals("stop")) 
				break;
		//	subjectnamelistcurriculum.add(subjectname); 
			
			System.out.println("Enter Subject Code:");
		//	subjectcodelistcurriculum.add(br.readLine()); //append to list.
			subjectcode=br.readLine();
			report.addData(subjectname,subjectcode);
			System.out.println("Enter Maximum Marks");
			maxmarkslist.add(Integer.parseInt(br.readLine()));
		}

	/*
		Semester sem=new Semester();
		sem.setSubjectcode(subjectcodelistcurriculum);

		System.out.println("Enter subject Code to check if exists in list:");
		String subjcode=br.readLine();

		if(sem.getSubjectcode().contains(subjcode)){
			System.out.println("Entered code" +subjcode+ " exists in curriculumsemlist \n");
		}
	*/	
		
		System.out.println("Student Details:");
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Enter Age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter marks");
		ArrayList<Integer> markslist = new ArrayList<Integer>();
		int marks=0;
		while(true) {
			marks=Integer.parseInt(br.readLine());
			if(marks<0) 
				break;
			markslist.add(marks);
		}
		report.setStudentDetails(name, age, markslist);
		System.out.println("Enter Address: ");
		String houseNo=br.readLine();
		String streetname=br.readLine();
		String cityname=br.readLine();
		String statename=br.readLine();
		int zipcode=Integer.parseInt(br.readLine());
		report.setAddressForStudent(houseNo, streetname, cityname, statename, zipcode);
		
		System.out.println("Enter Faculty Name:");
		ArrayList<String> facultynamelist = new ArrayList<String>();
		
		while(true) {
			String faculty=br.readLine();
			if(faculty.equals("stop")) 
				break;
			facultynamelist.add(faculty);
		}
		
		studentlist.add(report.getStudent());
		
		report.setSemesterForStudent(subjectname, subjectcode, facultynamelist,maxmarkslist);
		
		report.studDetails();
		/*
		System.out.println("Enter subject Code:");
		String subcode=br.readLine();

		if(sem.getSubjectcode().contains(subcode)){
			System.out.println("Entered code " +subcode+ " exists in curriculumsemlist \n");
			System.out.println("Subject Name \t Subject Code \t Max Marks");
			for(int i=0;i<report.getStudent().getSemester().getCurriculumSem().getSubjectCodeListCurriculum().size();i++) {
				if(subcode.equals(subjectcodelistcurriculum.get(i)))
				System.out.println(report.getStudent().getSemester().getCurriculumSem().getSubjectNameListCurriculum().get(i)+"\t"+report.getStudent().getSemester().getCurriculumSem().getSubjectCodeListCurriculum().get(i)+"\t"+report.getStudent().getSemester().getCurriculumSem().getMaxMarksList().get(i));
				else 
					System.out.println("Error");
					break;
			}
			
		}
		*/
	
	}

	
	
}		


		
		//System.out.println("Enter Subject Names");
		//String 
		
		
		/*//Displaying for 5 students
		for(int i=0;i<5;i++) {
			report.setAddressForStudent("52" +i, "MVP" +i ,"VZM"+i,"AP"+i,530002);
			ArrayList<String> cur= new ArrayList<String>();
			cur.add("CSE");
			cur.add("IT");
			report.setCuricculumForStudent(cur,"Simon"+i,5);
			ArrayList<Integer> marks=new ArrayList<Integer>();
			marks.add(3);
			marks.add(4);
			report.setStudentDetails("Divya"+i,28,marks);
			studentlist.add(report.getStudent());
			report.studDetails();
		}*/
		
		
		/*ArrayList<String> subjectnamelistcurriculum = new ArrayList<String>();
		subjectnamelistcurriculum.add("English");
		subjectnamelistcurriculum.add("Mathematics");
		subjectnamelistcurriculum.add("Social");
		subjectnamelistcurriculum.add("Computers");
		
		
		ArrayList<String> subjectcodelistcurriculum = new ArrayList<String>();
		subjectcodelistcurriculum.add("001");
		subjectcodelistcurriculum.add("002");
		subjectcodelistcurriculum.add("003");
		subjectcodelistcurriculum.add("004");
		
		ArrayList<String> facultynamelist = new ArrayList<String>();
		facultynamelist.add("P");
		facultynamelist.add("Q");
		facultynamelist.add("R");
		facultynamelist.add("S");*/
		
		

