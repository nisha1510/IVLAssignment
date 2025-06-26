package core_java_day8;

import java.util.LinkedList;

public class ProducerConsumerProblemDEmo {
	
	private static final int capacity = 10;
	private final LinkedList<Integer> buffer = new LinkedList();
	
	public synchronized void produce(int value) throws InterruptedException {
		//synchronized(this) {
			while(buffer.size()==capacity) {
				wait();
			}
			buffer.add(value);
			System.out.println("produce "+value);
			notify();
		//}
	}
	public synchronized void consume() throws InterruptedException {
		while(buffer.isEmpty()) {
			wait();
		}
		int value = buffer.removeFirst();
		System.out.println("product consumed "+ value);
		notify();
	}
}
