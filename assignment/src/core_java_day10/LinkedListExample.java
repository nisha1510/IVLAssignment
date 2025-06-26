package core_java_day10;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> call_history = new LinkedList<>();
		call_history.add("Nisha");
		call_history.add("Rajani");
		call_history.add("Chandu");
		call_history.add("Ramya");
		call_history.add("Pranali");
		call_history.add("Chitti");
		call_history.add("Madan");
		call_history.add("Kranti");
		call_history.add("Sravan");
		call_history.add("Anand");
		call_history.add("Manoj");
		
		System.out.println(call_history);
		System.out.println("Total size : "+call_history.size());
		System.out.println("checkContains : "+call_history.contains("Nisha"));
		System.out.println("GetName : "+call_history.get(2));
	}

}
