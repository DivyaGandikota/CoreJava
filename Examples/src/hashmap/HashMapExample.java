package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	ArrayList<HashMap<String,String>> var = new ArrayList<HashMap<String,String>>();
	
	public void addData(String key,String value) {
		HashMap<String,String> hash=new HashMap<>();
		hash.put(key, value);
		var.add(hash);
	}

	public void getData() {
		
		for(int i=0;i<var.size();i++) {
			for(Map.Entry<String, String> entry:var.get(i).entrySet()) {
			
				System.out.println(entry.getKey() + "\t" + entry.getValue());
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		HashMapExample hashmap=new HashMapExample();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter key and value");
		while(true) {
			
			String key=reader.readLine();
			if(key.equals("exit"))
				break;
			
			String value=reader.readLine();
			
			System.out.println();
			
			hashmap.addData(key,value);
			
		}
	
		hashmap.getData();
		
	}
}
