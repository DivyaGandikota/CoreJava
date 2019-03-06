package test1;

public class UseArrayData {
	
	ArrayData data = new ArrayData(null);
	
	public void getData() {
		data.display();
		
		String[][] details = {{"Divya","28"},{"Simmu","27"}};
		
		data.setTable(details);
		data.display();
		
		data.setTable(null);
		data.display();
	}
	public static void main(String[] args) {
		UseArrayData details = new UseArrayData();
		details.getData();
	}

}
