package test1;

public class StringManipulation {
	
	String s = new String("I like Computing");
	
	public static void main(String[] args) {
		
		
		
		StringManipulation str=new StringManipulation();
		
		str.length();
		
		str.manipulation("Selenium");
		
	}
	public void length() {
		
		System.out.println("Length: "+s.length());
		
	}
	
	public void manipulation(String s) {
		System.out.println("Length: "+s.length());
		System.out.println("UpperCase is: "+ s.toUpperCase());
		System.out.println("LowerCase is: "+ s.toLowerCase());
		System.out.println("Char at: " +s.charAt(3));
		System.out.println("Sub String: "+s.substring(2, 7));
		System.out.println("Index at: "+s.indexOf("in"));
		System.out.println("Is Empty: "+ s.isEmpty());
		System.out.println("Trim: " + s.trim());
	}
}

/*Output:
	Length: 16
	UpperCase is: I LIKE COMPUTING
	LowerCase is: i like computing
	Char at: i
	Sub String: like 
	Index at: 13
	Is Empty: false
	Trim: I like Computing
	Length: 8
	UpperCase is: SELENIUM
	LowerCase is: selenium
	Char at: e
	Sub String: leniu
	Index at: -1
	Is Empty: false
	Trim: Selenium
	*/
