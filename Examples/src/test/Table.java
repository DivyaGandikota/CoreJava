package test;

public class Table {
	// Table 3.
	public void multiply(){
		
		for(int i=1;i<=10;i++) {
		//	int j=i*3;
			System.out.println(i+"*3="+(i*3));
		}
	}
	public static void main(String[] args) {

		Table t=new Table();
		t.multiply();
	}
}
/*output:
	1*3=3
	2*3=6
	3*3=9
	4*3=12
	5*3=15
	6*3=18
	7*3=21
	8*3=24
	9*3=27
	10*3=30
*/