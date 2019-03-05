package test;

public class Numbers {
	
	public static void main(String[] args) {
		
		Numbers n = new Numbers();
		n.display();
		
	}
	public void display() {
		
		for(int i=1;i<=5;i++) {
			//System.out.print(i);
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);
				
			}
			
			System.out.println();
		}
	}


}
