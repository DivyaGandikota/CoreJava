package test;

public class Table {

	public void multiply(){
		
		for(int i=1;i<=10;i++) {
			int j=i*3;
			System.out.println(i+"*"+"3"+"="+j);
			}
	}
	public static void main(String[] args) {

		Table t=new Table();
		
		t.multiply();
		
	}

}
