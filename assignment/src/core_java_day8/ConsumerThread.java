package core_java_day8;

public class ConsumerThread extends Thread{
	private ProducerConsumerProblemDEmo pc;
	
	public ConsumerThread(ProducerConsumerProblemDEmo pc) {
		super();
		this.pc = pc;
	}
	
	public void run() {
		try {
			while(true) {
				pc.consume();
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
				
				e.printStackTrace();
		}
	}
}
