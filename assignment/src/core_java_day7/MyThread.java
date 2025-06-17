package core_java_day7;

class ThreadClass extends Thread{
	@Override
	public void run() {
		System.out.println("inside Thread class");
	}
}
public class MyThread {
	public static void main(String[] args) {
		ThreadClass t = new ThreadClass();
		t.start();
	}
}
