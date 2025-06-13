package core_java_day5;

class SharedResource {
    
	synchronized void process() {
        try {
            System.out.println("Waiting...");
            wait();  // Thread waits until notified
        } catch (InterruptedException e) { }
        System.out.println("Resumed after notification!");
    }

    synchronized void resumeProcess() {
        System.out.println("Notifying...");
        notify();  // Wakes up waiting thread
    }
}

public class WaitNotifyExample {
   
	public static void main(String[] args) {
        
		SharedResource resource = new SharedResource();
        
        new Thread(resource::process).start();
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        
        new Thread(resource::resumeProcess).start();
    }
}
