package test1;

public class Student {
	
	public String name;
	public int age;
	
	public Student() {
		 name = "Tom";
		 age=15;
	}
	
	public void display() {
		System.out.println("Name: "+name + " , Age: "+ age);
	}
	public void edit(String n,int a) {
			
		this.name=n;
		this.age=a;
		//System.out.println("Name: "+name + " , Age: "+ age);
	}
	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.display();
		student.edit("Amy",20);
		student.display();
	}
}
