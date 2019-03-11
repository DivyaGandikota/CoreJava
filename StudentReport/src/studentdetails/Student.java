package studentdetails;

public class Student {
	
	private String name;
	private int age;
	private int marks1;
	private int marks2;

	private Address address;
	
	private Curicculum curicculum;
	
	public Student(String name,int age, int marks1,int marks2) {
		this.name=name;
		this.age=age;
		this.marks1=marks1;
		this.marks2=marks2;
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
	public int getMarks1() {
		return this.marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1=marks1;
	}
	public int getMarks2() {
		return this.marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2=marks2;
	}
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
