package core_java_day7;

import java.util.concurrent.*;

class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return type + " of ₹" + amount;
    }
}

public class BankAppProducerConsumer {
    private static final BlockingQueue<Transaction> queue = new ArrayBlockingQueue<>(5);

    static class Producer implements Runnable {
        public void run() {
            String[] types = {"Deposit", "Withdraw"};
            for (int i = 1; i <= 10; i++) {
                try {
                    Transaction txn = new Transaction(types[i % 2], i * 1000);
                    queue.put(txn);
                    System.out.println("Produced: " + txn);
                    Thread.sleep(300);
                } catch (InterruptedException e) {}
            }
        }
    }

    static class Consumer implements Runnable {
        public void run() {
            while (true) {
                try {
                    Transaction txn = queue.take();
                    System.out.println("Consumed: " + txn);
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }
}
