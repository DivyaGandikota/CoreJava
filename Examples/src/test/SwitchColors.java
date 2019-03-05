package test;

public class SwitchColors {

	public static void main(String[] args) {

		SwitchColors s = new SwitchColors();
		
		s.display();
		
	}

public void display() {
		
		int i=0;
		
		if(i>0 && i<8) {
			switch(i) {
				case 1: System.out.println("Violet");
				break;
				case 2:System.out.println("Indigo");
				break;
				case 3:System.out.println("Blue");
				break;
				case 4:System.out.println("Green");
				break;
				case 5:System.out.println("Yellow");
				break;
				case 6:System.out.println("Orange");
				break;
				case 7:System.out.println("Red");
				break;
			}
		}else {
			System.out.println("Error!..Give Number less than 8");
		}
		
	}
}
