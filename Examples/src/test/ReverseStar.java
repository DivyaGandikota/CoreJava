package test;

public class ReverseStar {

	public void display() {
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		ReverseStar rs=new ReverseStar();
		
		rs.display();
		
	}

}

/*output:
	*****
	****
	***
	**
	*
*/