package core_java_day12;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		Stack<Integer> bookNumber = new Stack<>();
		bookNumber.push(101);
		bookNumber.push(102);
		System.out.println(bookNumber);
		
		bookNumber.pop();
		System.out.println(bookNumber);
	}
}
