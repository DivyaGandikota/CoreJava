package studentdetails;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private ArrayList<Integer> markslist;

	private Address address;
	
	private Semester semester;
	
	public Student() {
		this.name=name;
		this.age=age;
		this.markslist=markslist;
	}
	public Student(String name,int age, ArrayList<Integer> markslist) {
		this.name=name;
		this.age=age;
		this.markslist=markslist;
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public ArrayList<Integer> getMarksList() {
	return this.markslist;
	}
	public void addMarks(Integer markslist) {
		this.markslist.add(markslist);
	}
	public void setMarksList(ArrayList<Integer> markslist) {
		this.markslist=markslist;
	}
	//Address
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address=address;
	}	
	//Semesters
	public Semester getSemester() {
		return this.semester;
	}
	public void setSemester(Semester semester) {
		this.semester=semester;
	}
	
}
