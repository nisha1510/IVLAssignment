package core_java_day8;

public class ProducerThread extends Thread{
	
	private ProducerConsumerProblemDEmo pc;
	
	public ProducerThread(ProducerConsumerProblemDEmo pc) {
		super();
		this.pc = pc;
	}



	public void run() {
		int value = 0;
		try {
			while(true) {
				pc.produce(value++);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
				
				e.printStackTrace();
		}
	}
}

