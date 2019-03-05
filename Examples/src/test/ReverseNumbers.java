package test;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		ReverseNumbers rn=new ReverseNumbers();
		
		rn.display();
		
		
	}
	public void display() {
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}

/*output:
	
	12345
	1234
	123
	12
	1
*/