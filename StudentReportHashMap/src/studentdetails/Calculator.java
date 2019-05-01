package studentdetails;

import java.util.ArrayList;

public class Calculator {
	
	public int sum(ArrayList<Integer> markslist) {
	
		int sum=0;
		for(int i=0;i<markslist.size();i++) {
			sum=sum+markslist.get(i);
		}
		return sum;
		
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
	public int percentage(ArrayList<Integer> markslist, int total) {
		
		return (multiply(sum(markslist),100))/total;  ///a=((a+b)*100)/total;
	}
}
