package test1;

public class CollegeStudent extends Student{
	
	public double gpa;
	
	public CollegeStudent() {
		gpa=4;
	}
	
	public void result() {
		System.out.println("GPA: "+gpa);
	}
	
	public static void main(String[] args) {
		
		CollegeStudent col=new CollegeStudent();
		col.display();
		col.result();
		col.edit("Tom", 6);
		col.display();
	}
	

}

/*output:
	Name: Tom , Age: 15
	GPA: 4.0
	Name: Sri , Age: 6
*/