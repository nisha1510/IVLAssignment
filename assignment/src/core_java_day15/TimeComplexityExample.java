package core_java_day15;

import java.util.LinkedList;
import java.util.List;

public class TimeComplexityExample {

	public static void main(String[] args) {
		
		String str1="Nisha";
//		System.out.println(str1);
		String str2="Nisha";
//		System.out.println(str2);
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("Nisha");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
	}

}
