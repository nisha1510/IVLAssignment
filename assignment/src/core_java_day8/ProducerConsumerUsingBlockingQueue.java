package core_java_day8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> bque = new ArrayBlockingQueue<Integer>(5);
		//producer
		Runnable producer = () ->{
			int value = 0;
			try {
				while(true) {
					bque.put(value);
					System.out.println("Produce "+value);
					value++;
					Thread.sleep(1000);
				}
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		};

		//consumer
		Runnable consumer = () ->{
			try {
				while(true) {
					int value = bque.take();//blocks if queue is empty
					System.out.println("consume "+value);
					Thread.sleep(1000);
				}
			}catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		};
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
