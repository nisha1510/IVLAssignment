package core_java_day7;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class InventorySync2 {
	
	private int stock = 100;
	private Lock lock = new ReentrantLock();
	
	public synchronized void purchase(String user, int qty) {
		lock.lock();
		try {
			System.out.println("acquires lock");
			if(stock>=qty) {
				System.out.println(user+" purchased "+qty+" item ");
				stock-=qty;
				System.out.println("available stock : "+getStock());
			}
			else
			{
				System.out.println("not purchased");
			}
		}finally {
			lock.unlock();
			System.out.println("lock released");
		}
	}

	public int getStock() {
		return stock;
	}
}
