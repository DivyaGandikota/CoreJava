package test;

public class Example12 {

	public void display() {
			
			for(int i=1;i<=5;i++) {
				for(int j=5;j>=i;j--) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
	
	public static void main(String[] args) {
		
			Example12 e=new Example12();
			
			e.display();
			
	}

}
