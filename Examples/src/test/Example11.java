package test;

public class Example11 {
	
	public void display() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Example11 e=new Example11();
		
		e.display();
		
	}

}
