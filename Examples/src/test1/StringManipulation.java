package test1;

public class StringManipulation {
	
	String s;
	
	public StringManipulation() {
		s = new String("I like Computing");
	}
	public void setString(String s) {
		this.s=s;
	}
	
	public static void main(String[] args) {
		
		StringManipulation str=new StringManipulation();
		
		str.length();
		str.uppercase();
		str.lowercase();
		str.subString();
		str.indexAt();
		str.charAtIndex();
		str.isEmptyString();
		str.trimString();	
		
		System.out.println();
		str.setString("selenium");
		str.length();
		str.uppercase();
	}
	public void length() {
		System.out.println("Length: "+s.length());
	}
	public void uppercase() {
		System.out.println("UpperCase is: "+ s.toUpperCase());
	}
	public void lowercase() {
		System.out.println("LowerCase is: "+ s.toLowerCase());
	}
	public void charAtIndex() {
		System.out.println("Char at: " +s.charAt(3));
	}
	public void subString() {
		System.out.println("Sub String: "+s.substring(2, 7));
	}
	public void indexAt() {
		System.out.println("Index at: "+s.indexOf("in"));
	}
	public void isEmptyString() {
		System.out.println("Is Empty: "+ s.isEmpty());
	}
	public void trimString() {
		System.out.println("Trim: " + s.trim());
	}

}

/*
 * Output:
	Length: 16
	UpperCase is: I LIKE COMPUTING
	LowerCase is: i like computing
	Sub String: like 
	Index at: 13
	Char at: i
	Is Empty: false
	Trim: I like Computing
	
	Length: 8
	UpperCase is: SELENIUM

*/
