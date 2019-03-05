package test;

public class ArithmeticOps {
	
	// ADD,SUB,MUL,DIV,REM
	
	int a=15;
	int b=20;
	int c;

	public static void main(String[] args) {
		
		ArithmeticOps ops = new ArithmeticOps();
		
		ops.sum();
		ops.difference();
		ops.multiply();
		ops.quotient();
		ops.remainder();
		
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
	public void remainder() {
		c=a%b;  //20%15 = 5, 15%20=15
		System.out.println("Remainder is :"+c);
	}
}

/*output:
	Sum is :35
	Difference is :5
	Multiply is :300
	Quotient is :0
	Remainder is :15
	*/
