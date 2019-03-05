package test;

public class PrintNames {
	
	public void display() {
		
		String[] name= {"Divya","A","B"};  //new String[10];  // 
		
		
		
		for(int i=0;i< name.length;i++) {
			
		//	name[i] = "Divya";
			
		
			System.out.println(name[i]);
			
		}
		
	}

	public static void main(String[] args) {
		
		PrintNames names= new PrintNames();
		
		names.display();

	}

}


//String[] name=new String[3];



		//name= {"Divya","A","B"};
		
		/*name[0]="A";
		name[1]="B";
		name[2]="C";
		name[3]="D";
		name[4]="E";
		name[5]="F";
		name[6]="G";
		name[7]="H";
		name[8]="I";
		name[9]="J";
		*/
