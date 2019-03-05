package test;
//Print numbers from 1 to 10
public class LoopConcept {
	
	public static void main(String[] args) {
		
		LoopConcept lc=new LoopConcept();
		
		lc.print();
			
	}
	public void print() {
		System.out.println("for loop");
		
		for(int i=1 ;i<=10;i++) {
			
			System.out.println(i);
		
		}
		
		System.out.println("while loop");
		int j=1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
	}

}

/*Output:
	for loop
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	while loop
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	*/