package test;

public class OddNumber {
	
	public void oddNum() {

		for(int i=1;i<20;i++) {
			int j=i%2;
			if(j==1) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {

	OddNumber odd=new OddNumber();
	odd.oddNum();
	}

}
