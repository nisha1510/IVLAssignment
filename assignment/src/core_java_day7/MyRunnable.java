package core_java_day7;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Runnable");
	}
}

public class MyRunnable {
	public static void main(String[] args) {
		
		Thread th = new Thread(new MyThread1());
		th.start();
	}
}
