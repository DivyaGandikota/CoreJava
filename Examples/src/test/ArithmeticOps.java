package test;

public class ArithmeticOps {
	
	int a=15;
	int b=20;
	int c;

	public static void main(String[] args) {
		
		ArithmeticOps ops = new ArithmeticOps();
		
		ops.sum();
		ops.difference();
		ops.multiply();
		ops.quotient();
		ops.Remainder();
		
	}
	public void sum() {
		c=a+b;	
		System.out.println("Sum is :"+c);
	}
	public void difference() {	
		c=b-a;
		System.out.println("Difference is :"+c);
	}
	public void multiply() {
		c=a*b;
		System.out.println("Multiply is :"+c);
	}
	public void quotient() {
		c=a/b; //15/20
		System.out.println("Quotient is :"+c);
	}
	public void Remainder() {
		c=b%a;  //20%15 = 5
		System.out.println("Remainder is :"+c);
	}
	

}
