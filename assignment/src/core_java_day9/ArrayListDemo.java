package core_java_day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> shopping_list = new ArrayList<>();
		shopping_list.add("shampoo");
		shopping_list.add("conditioner");
		shopping_list.add("shoes");
		shopping_list.add("shampoo");
		

		List<String> shopping_list1 = new ArrayList<>();
		shopping_list1.add("soap");
		shopping_list1.add("facewash");
		
		System.out.println("List1 : "+shopping_list);
		System.out.println("List2 : "+shopping_list1);
		System.out.println("Size of List 1 : "+shopping_list.size());
		System.out.println("Size of List 2 : "+shopping_list1.size());
		
		shopping_list.addAll(shopping_list1);
		System.out.println("\naddAll     : "+shopping_list);
		
		System.out.println("containAll : "+shopping_list.containsAll(shopping_list1));
		
		shopping_list.removeAll(shopping_list1);
		System.out.println("removeAll  : "+shopping_list);
		
		shopping_list.add(0,"Handwash");
		System.out.println("add(i,o)   : "+shopping_list);
		
		shopping_list.set(1, "Crocks");
		System.out.println("Set(i,o)   : "+shopping_list);
		
		System.out.println("get(i)     : "+shopping_list.get(1));



	}

}
