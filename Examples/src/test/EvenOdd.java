package test;

public class EvenOdd {

	public static void main(String[] args) {
		
		EvenOdd eo=new EvenOdd();
		
		eo.show();
		
	}
	public void show() {
		
		int a=4;
		int b=19;
		int c = a%b; // 19%2= 1 20%2=0 , 19%3=1 , 19%4=3, 4%19
		
		
			
		if(a>b && c%2==0) {
			System.out.println("A is Even");
		}
		else if(a>b && c%2==1){
			System.out.println("A is Odd");
		}else if(a<b && a%2==0) {
			System.out.println("A is Even");	
		}else {
			System.out.println("A is Odd");
		}
	}

}
