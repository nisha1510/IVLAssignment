package core_java_day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
//		Map<Integer,String> cust = new HashMap<>();
//		cust.put(101, "Preeti");
//		cust.put(102, "Sachin");		
//		System.out.println(cust);
	
//		Map<Integer,List<String>> cust = new HashMap<>();
//		cust.put(101, Arrays.asList("Nisha","Rajani"));
//		System.out.println(cust);
		
		Map<String,List<String>> cust = new HashMap<>();
		cust.put("Fashion", Arrays.asList("Nisha","Rajani","Chandu"));
		cust.put("Laptop", Arrays.asList("Chityala","Nivetha","ChittiRaja"));
	
		cust.putIfAbsent("Electronics", new ArrayList<>());
		cust.get("Electronics").add("Jaya");
		
		for(Map.Entry<String, List<String>> entry : cust.entrySet()) {
			System.out.println("Category : "+entry);
		}
		
		System.out.println(cust.size());
		System.out.println(cust.containsKey("Fashion"));
		System.out.println(cust.containsValue("Nisha"));
		
	}
}
