package core_java_day8;

public class ProducerConsumerMain {
	
	public static void main(String[] args) {
		ProducerConsumerProblemDEmo obj = new ProducerConsumerProblemDEmo();
		new ProducerThread(obj).start();
		new ConsumerThread(obj).start();
	}
}
