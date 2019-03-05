package test;

public class SwitchExample {
	
	//Print Days

	public static void main(String[] args) {
		
		SwitchExample s=new SwitchExample();
		s.display(2);
		s.display(5);

	}
	public void display(int i) {
	
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
				default:System.out.println("Error!!");
		}	
	}
}

/*output:
	Monday
	Thursday
*/