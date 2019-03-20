package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Student student=new Student();
		
		/*Scanner userinput= new Scanner(System.in);
		System.out.println("Input name and age: ");
		String output= userinput.nextLine();
		System.out.println(output);
		userinput.close();*/
	/*	
		student.display();
		student.edit("Amy",20);
		student.display();*/
		
		//using Buffered Reader for user Input
		BufferedReader br = new BufferedReader(new   InputStreamReader(System.in));
	       
        System.out.println("Enter name");
        String name=br.readLine();

        System.out.println("Enter  age");
        int age = Integer.parseInt(br.readLine());
       
        System.out.println("Enter marks");
        double marks = Double.parseDouble(br.readLine());

        System.out.println("Enter Gender(M/F)");
        char gender=(char)br.read();
        
        System.out.println("Student Information:- " + "\nName is:"+name+"\n"+"Age is" + age+"\n"+"marks is:"+marks +"\nGender is:"+gender);

				
	}
}
