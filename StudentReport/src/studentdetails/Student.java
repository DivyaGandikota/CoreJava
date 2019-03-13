package studentdetails;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private ArrayList<Integer> markslist;
	//private int marks2;

	private Address address;
	
	private Curicculum curicculum;
	
	public Student(String name,int age, ArrayList<Integer> markslist) {
		this.name=name;
		this.age=age;
		this.markslist=markslist;
		/*this.marks1=marks1;
		this.marks2=marks2;*/
		
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
	/*public int getMarks2() {
		return this.marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2=marks2;
	}*/
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address=address;
	}
	public Curicculum getCuricculum() {
		return this.curicculum;
	}
	public void setCuricculum(Curicculum curicculum) {
		this.curicculum=curicculum;
	}
}
