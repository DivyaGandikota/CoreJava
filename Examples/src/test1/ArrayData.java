package test1;

public class ArrayData {
	
	private String table[][];
	
	public ArrayData(String[][] table) {
		try {
			this.table=table;
		}catch(Exception e) {
			System.out.println("Error in Constructor");
			this.table=new String[][]{{"A","14"},{"B","15"},{"C","18"},{"D","12"},{"E","11"}};
		}
			
	}
	public void setTable(String[][] table ) {
		this.table= table;
		
	}
	public String[][] getTable() {
		return this.table;
	}
	public void display() {
		System.out.println("Name" + "\t" + "Age");
		try {
			for(int i=0;i<table.length;i++) {
				for(int j=0;j<table[i].length;j++) { 			// table[i].length
					System.out.print(table[i][j]+ "\t" );	
				}
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}
	public static void main(String[] args) {
		
		String table[][]={{"A","14"},{"B","15"},{"C","18"},{"D","12"},{"E","11"}};
		ArrayData data = new ArrayData(null);
		data.display();
		
		String table1[][]= {{"F","12"},{"G","13"},{"H","14"}};
		data.setTable(table1);
		//ArrayData data1 = new ArrayData(table1);
		data.display();
		
		
	}
}

	//	String table[][]={{"A","14"},{"B","15"},{"C","18"},{"D","12"},{"E","11"}};
		
	/*	String table[][]=new String[5][2];
		
		table[0][0]="A";
		table[1][0]="B";
		table[2][0]="C";
		table[3][0]="D";
		table[4][0]="E";
		
		table[0][1]="14";
		table[1][1]="15";
		table[2][1]="18";
		table[3][1]="12";
		table[4][1]="11";
		*/
	
		

/*output:
	Name	Age
	A		14	
	B		15	
	C		18	
	D		12	
	E		11
	*/
