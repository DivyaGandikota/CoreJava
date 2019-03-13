package test1;

import java.util.ArrayList;

public class ArrayListExample {
	
	private ArrayList<String> name = new ArrayList<String>();  
	private ArrayList<Integer> age= new ArrayList<Integer>();
	
	public ArrayListExample(ArrayList<String> name, ArrayList<Integer> age) {
		try {
			this.name=name;
			this.age=age;
		}catch(Exception e) {
			System.out.println("Error in Constructor");
			this.name= new ArrayList<String>();
			this.age = new ArrayList<Integer>();
		//	this.table=new ArrayList<String>{{"A","14"},{"B","15"},{"C","18"},{"D","12"},{"E","11"}};
		}
			
	}
	public void addName(String name ) {
		this.name.add(name);
		//= name;
		
	}
	public ArrayList<String> getName() {
		return this.name;
	}
	public void addAge(Integer age) {
		this.age.add(age);
		//=age;
	}
	public ArrayList<Integer> getAge(){
		return this.age;
	}
	public void removeName(String name) {
		this.name.remove(name);
	}
	public void removeAge(int age) {
		this.age.remove(age);
	}
	public void display() {
		System.out.println("Name" + "\t" + "Age");
		try {
			for(int i=0;i<name.size();i++) {
					System.out.print(name.get(i)+ "\t" +age.get(i));	
				
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}
	public static void main(String[] args) {
		
		//String table[][]={{"A","14"},{"B","15"},{"C","18"},{"D","12"},{"E","11"}};
		//ArrayListExample data = new ArrayListExample(name,age);
		
		
		ArrayList<String> name=new ArrayList<String>();
		ArrayList<Integer> age=new ArrayList<Integer>();
		name.add("Adi");
		age.add(30);
		ArrayListExample array=new ArrayListExample(name,age);
		
		array.addName("Divya");
		array.addAge(28);
		array.addName("Simon");
		array.addAge(27);
		array.display();
		array.removeName("Divya");
		array.removeAge(1);
		
		array.display();
	
		
	}
}

	//	String table[][]={{"A","14"},{"B","15"},{"C","18"},{"D","12"},{"E","11"}};
		
	/*	String table[][]=new String[5][2];
		
		table[0][0]="A";
		table[1][0]="B";
		table[2][0]="C";
		table[3][0]="D";
		table[4][0]="E";
		
		table[0][1]="14";
		table[1][1]="15";
		table[2][1]="18";
		table[3][1]="12";
		table[4][1]="11";
		*/
	
		

/*output:
	Name	Age
	A		14	
	B		15	
	C		18	
	D		12	
	E		11
	*/
