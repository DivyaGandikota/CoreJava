package test;

public class EvenOdd {
	// to check if given two numbers are Odd or Even.

	public static void main(String[] args) {
		
		EvenOdd eo=new EvenOdd();
		
		eo.show();
		
	}
	
	public boolean isEven(int a)	{
		if (a%2==0)
			return true;
		return false;
	}
	
	public void show() {
		
		int a=230;
		int b=1221;
		//int c = a%b; // 19%2= 1 20%2=0 , 19%3=1 , 19%4=3, 4%19
		
		if (a==b)	{
			if (isEven(a))	{
				System.out.println("A & B are even");
			}
			else	{
				System.out.println("A & B are odd");
			}
		}
		else	{
			if (isEven(a) && isEven(b))
				System.out.println("A & B are even");
			else if(isEven(a))
				System.out.println("A is even and B is odd");
			else if(isEven(b))
				System.out.println("A is odd and B is even");
			else
				System.out.println("A and B are odd");
		}
			
		/*if(a>b && c%2==0) {
			System.out.println("A is Even");
		}
		else if(a>b && c%2==1){
			System.out.println("A is Odd");
		}else if(a<b && a%2==0) {
			System.out.println("A is Even");	
		}else {
			System.out.println("A is Odd");
		}*/
	}

}
//Output: A is even and B is odd
