package core_java_day15;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;

public class FailfastIterator {
	
	public static void main(String[] args) {
	
		ArrayList<String> arrlist = new ArrayList<>(5);
		
		arrlist.add("Kiwi");
		arrlist.add("Oranges");
		arrlist.add("Banana");
		arrlist.add("Apple");
		arrlist.add("Cherries");
		
		System.out.println(arrlist);
		
//		Iterator<String> itr = arrlist.iterator();
//		while (itr.hasNext()) {
//			if (itr.next().equals("Apple")) {
//				arrlist.remove("Apple"); 
//			}
//		}
//		System.out.println(arrlist);
		
//		while (itr.hasNext()) {
//			if (itr.next().equals("Apple")) {
//				al.add("Pineapple"); // throws ConcurrentModification
//			}
//		}
//		System.out.println(al);
		
		System.out.println("\n Using forEach loop");
		for(String arlist : arrlist ) {
			System.out.println(arlist);
		}
		
//List Iterator - 
//		ListIterator<String> listItr = arrlist.listIterator();
//		while(listItr.hasNext()) {
//			if(listItr.next().equals("Apple")) {
//				listItr.remove();
//				listItr.add("DragonFruit");
//			}
//		}
		
		System.out.println("\n Using List Iterator in forward direction");
		ListIterator<String> listItr = arrlist.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("\n Using List Iterator in backward direction");
		ListIterator<String> listItrback = arrlist.listIterator(arrlist.size());
		while(listItrback.hasPrevious()) {
			System.out.println(listItrback.previous());
		}
		
//		System.out.println("\n Enumeration");
//		Enumeration<String> enumList = ((Object) arrlist).elements();
//		System.out.println(arrlist);
			
	}
}