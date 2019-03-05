package test;

public class TestString {
	
	//Display values using class object
	
	private String name="Divya";
	protected String location="India";
	public String project="Java";
	
	// to access value in the private variable , we have to create a method.
	/*public String getName() {
		
		return name;
		
	}*/
	public static void main(String[] args) {
		
		TestString t=new TestString();
		
		System.out.println(t.name); //t.getName()
		System.out.println(t.location);
		System.out.println(t.project);
		
	}
}
/*output:
	Divya
	India
	Java
*/