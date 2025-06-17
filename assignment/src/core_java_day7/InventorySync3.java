package core_java_day7;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class InventorySync3 {
	
	private int stock = 100;
    private Lock lock = new ReentrantLock();
 
 
    public boolean purchase(String user, int qty) {
        lock.lock();
        try {
            if (stock >= qty) {
                System.out.println(user + " Purchased " + qty + " items.");
                stock -= qty;
                System.out.println("Remaining stock: " + stock);
                return true;
            } else {
                System.out.println(user + " could not purchase. Not enough stock.");
                return false;
            }
        } finally {
            lock.unlock();
        }
    }
 
    public int getStock() {
        return stock;
    }
}
