package test;

public class Star {

	public static void main(String[] args) {
	
		Star s=new Star();
		
		s.display();
		

	}
	
	public void display() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
			
	}

}
