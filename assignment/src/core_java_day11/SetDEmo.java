package core_java_day11;

import java.util.HashSet;
import java.util.Set;

public class SetDEmo {
	public static void main(String[] args) {
		Set<String> set = new HashSet();
		set.add("reading");
		set.add("cooking");
		set.add("travelling");
		set.add("reading");
		
		System.out.println(set);
	}
}
