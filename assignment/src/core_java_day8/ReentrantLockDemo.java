package core_java_day8;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
//thread can acquire the same lock multiple times without getting blocked.

	public static void main(String[] args) {
		
		ReentrantLock renter = new ReentrantLock();
		renter.lock();//counter=1
		renter.lock();//counter-2
		
		System.out.println(renter.isLocked());
		System.out.println(renter.isHeldByCurrentThread());

		renter.unlock();
		System.out.println(renter.isLocked());
		System.out.println(renter.isHeldByCurrentThread());
		
		renter.unlock();
		System.out.println(renter.isLocked());
		System.out.println(renter.isHeldByCurrentThread());
	}

}
