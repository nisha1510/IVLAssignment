package core_java_day7;

class ThreadA extends Thread {
    public void run() {
        System.out.println("Thread A started");

        Thread b = new Thread(() -> {
            System.out.println("Thread B started");
            try { Thread.sleep(300); } catch (InterruptedException e) {}
            System.out.println("Thread B finished");
        });

        Thread c = new Thread(() -> {
            System.out.println("Thread C started");
            try { Thread.sleep(200); } catch (InterruptedException e) {}
            System.out.println("Thread C finished");
        });

        b.start();
        c.start();

        try {
            b.join(); // Wait for B to finish
            c.join(); // Wait for C to finish
            System.out.println("inside try");
        } catch (InterruptedException e) {
        	System.out.println("inside catch");
        }

        System.out.println("Thread A finished");
    }
}

public class MainThreadInsideThread {
    public static void main(String[] args) {
        new ThreadA().start();
    }
}
