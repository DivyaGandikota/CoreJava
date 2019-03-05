package test;

public class SwitchExample {

	public static void main(String[] args) {
		
		SwitchExample s=new SwitchExample();
		
		s.display();

	}
	public void display() {
		
		int i=3;
		
		if(i<7) {
			switch(i) {
				case 1: System.out.println("Sunday");
				break;
				case 2:System.out.println("Monday");
				break;
				case 3:System.out.println("Tuesday");
				break;
				case 4:System.out.println("Wednesday");
				break;
				case 5:System.out.println("Thursday");
				break;
				case 6:System.out.println("Friday");
				break;
				case 0:System.out.println("Saturday");
				break;
			}
		}else {
			System.out.println("Error!..Give Number less than 7");
		}
		
	}

}
