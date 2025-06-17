package core_java_day7;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class InventorySync2 {
	
	private int stock = 100;
	private Lock lock = new ReentrantLock();
	
	public synchronized void purchase(String user, int qty) {
		lock.lock();
		try {
			if(stock>=qty) {
				System.out.println(user+" purchased "+qty+" item ");
				stock-=qty;
			}
			else
			{
				System.out.println("not purchased");
			}
		}finally {
			lock.unlock();
		}
	}

	public int getStock() {
		return stock;
	}
}
