package test;

//Print Odd Numbers only
public class OddNumber {
	
	public void oddNum() {

		for(int i=1;i<20;i++) {
			//int j=i%2;
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {

	OddNumber odd=new OddNumber();
	odd.oddNum();
	}

}
/*output:
	1
	3
	5
	7
	9
	11
	13
	15
	17
	19
*/