package core_java_day10;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> arrque = new ArrayDeque<>();
		arrque.add(2);
		arrque.add(5);
		arrque.add(6);
		arrque.add(1);
		
		Queue<Integer> prque = new PriorityQueue<>();
		prque.add(2);
		prque.add(5);
		prque.add(6);
		prque.add(1);
		
		System.out.println(arrque);	
		System.out.println(prque);
	}
}
