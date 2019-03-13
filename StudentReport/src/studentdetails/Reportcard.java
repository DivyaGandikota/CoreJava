package studentdetails;

import java.util.ArrayList;

public class Reportcard {
	
//	ArrayList<Student> studentlist;
	Student s;
	Calculator calc=new Calculator();
	Address address=new Address();
	Curicculum curicculum=new Curicculum();
	
	private int total=10;
	private int percentage;
	
	public void studDetails() {
		String name=s.getName();
		int age=s.getAge();
		ArrayList<Integer> markslist=s.getMarksList();
		/*int marks1=s.getMarks1();
		int marks2=s.getMarks2();*/
		
		percentage=calc.percentage(markslist, total);
		
		//String subjectname1=s.getCuricculum().getSubjectName1();
		//String subjectname2=s.getCuricculum().getSubjectName2();
		String facultyname=s.getCuricculum().getFacultyname();
		int maxmarks=s.getCuricculum().getMaxmarks();
		
	//	System.out.println("Name: " +name+ " Age: "+age + " Address:   "+ s.getAddress().getHouseNo() + " Marks1:  "+marks1 + " Marks2:  "+marks2);
		System.out.println("Name: " +name+ " Age: "+age);
		System.out.println();
		System.out.println("Subject" + "\t\t\t" + "MarksScored" + "\t\t" + "MaxMarks" );
		System.out.println();
		for(int i=0;i<curicculum.getSubjectNameList().size();i++) {
			System.out.println(curicculum.getSubjectNameList().get(i) + "\t" + s.getMarksList().get(i) + "\t" +maxmarks);
		}
		//System.out.println(subjectname1 +"\t"+ marks1 + "\t\t\t" + maxmarks);
		//System.out.println(subjectname2 +"\t"+ marks2 + "\t\t\t" + maxmarks);
		System.out.println();
		System.out.println("Total" + "\t\t\t" + calc.sum(s.getMarksList()) + "\t\t\t" +total);
		System.out.println("Percentage" +"\t\t"+ percentage + "\t\t\t" + "100%");
	}
	public void setAddressForStudent() {
		address.setHouseNo("52");
		address.setStreetName("MSN");
		address.setCityName("VZM");
		address.setStateName("AP");
		address.setZipcode(530017);
	}
	
	public void setStudentDetails() {
		ArrayList<Integer> markslist=new ArrayList<Integer>();
		markslist.add(3);
		markslist.add(4);
		
		s=new Student("Divya",28,markslist);	
		s.setAddress(address);
		s.setCuricculum(curicculum);
	}
	public void setCuricculumForStudent() {
		
		curicculum.addSubjectNameList("CSE");
		curicculum.addSubjectNameList("IT");
		//curicculum.setSubjectName1("Computer Science");
		//curicculum.setSubjectName2("Information Technology");
		curicculum.setFacultyname("Simon");
		curicculum.setMaxmarks(5);
	}
	
	public int getPercentage() {
		return this.percentage;
	}
	public void setPercentage(int a,int b) {
		
		this.percentage=calc.percentage(s.getMarksList(),total);
	}
	public void grade(int percentage) { 
		
	 	try {
			if(percentage>= 80) {
				System.out.println("Grade \t\t\t" + "A");
			//	System.out.println("Grade A: " +percentage);
			}else if(percentage>=60 && percentage<80){
				System.out.println("Grade \t\t\t" + "B" + "\t\t\t" + "A");
				//System.out.println("Grade B: " +percentage);
			}else if(percentage>=40 && percentage<60) {
				System.out.println("Grade C: "+percentage);
			}else if(percentage<40) {
				System.out.println("Fail: " +percentage);
			}else {
				System.err.println("Error");
			}
		 	}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		
		Reportcard report= new Reportcard();
		report.setAddressForStudent();
		report.setCuricculumForStudent();
		report.setStudentDetails();
		report.studDetails();
		report.grade(report.getPercentage());
	}
	
}