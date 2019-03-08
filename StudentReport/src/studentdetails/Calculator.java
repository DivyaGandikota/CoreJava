package studentdetails;

public class Calculator {
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int quotient(int a,int b) {
		return a/b;
	}
	public int remainder(int a,int b) {
		return a%b;
	}
	public int percentage(int a,int b, int total) {
		return (multiply(sum(a,b),100))/total;  ///a=((a+b)*100)/total;
	}
}
