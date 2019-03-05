package test;

public class PrintNames {
	
	public void display() {
		
		for(int i=0;i<10;i++) {
			
			
			
			String[] name=new String[10];
			
			//name[i]= ["Divya","A"];
			
			name[0]="A";
			name[1]="B";
			name[2]="C";
			name[3]="D";
			name[4]="E";
			name[5]="F";
			name[6]="G";
			name[7]="H";
			name[8]="I";
			name[9]="J";
			
			System.out.println(name[i]);
			
		}
		
	}

	public static void main(String[] args) {
		
		PrintNames names= new PrintNames();
		
		names.display();

	}

}
