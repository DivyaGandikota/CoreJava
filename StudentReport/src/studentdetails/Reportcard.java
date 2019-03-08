package studentdetails;

public class Reportcard {
	
	Student s= new Student("Divya",28,4,3);
	Calculator calc=new Calculator();
	
	private int total=10;
	private int percentage;
	
	public void studDetails() {
		String name=s.getName();
		int age=s.getAge();
		int marks1=s.getMarks1();
		int marks2=s.getMarks2();
		percentage=calc.percentage(marks1, marks2, total);
		
		System.out.println("Name: " +name+ " Age: "+age + " Marks1:  "+marks1 + " Marks2:  "+marks2);
	}
	public int getPercentage() {
		return this.percentage;
	}
	public void setPercentage(int a,int b) {
		
		this.percentage=calc.percentage(s.getMarks1(), s.getMarks2(),total);
	}
	public void grade(int percentage) { 
		
	 	try {
			if(percentage>= 80) {
				System.out.println("Grade A: " +percentage);
			}else if(percentage>=60 && percentage<80){
				System.out.println("Grade B: " +percentage);
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
		report.studDetails();
		report.grade(report.getPercentage());
		System.out.println();
	
		
	}
	
}
