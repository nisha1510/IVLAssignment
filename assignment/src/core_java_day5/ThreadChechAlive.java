package core_java_day5;

public class ThreadChechAlive {
	
	public static void main(String[] args) {
        
		MyThread t1 = new MyThread();
        t1.start();

        System.out.println("Is thread t1 alive? " + t1.isAlive());
        
        try { 
        	Thread.sleep(2000); 
        } 
        catch (InterruptedException e) { 
        	
        }

        System.out.println("Is thread t1 alive now? " + t1.isAlive());
    }
}
class MyThread extends Thread {
    public void run() {
        try { 
        	Thread.sleep(1000); 
        } 
        catch (InterruptedException e) { 
        	
        }
        System.out.println("Thread execution completed.");
    }
}

