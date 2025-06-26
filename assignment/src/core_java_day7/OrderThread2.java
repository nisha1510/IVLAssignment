package core_java_day7;

public class OrderThread2 extends Thread{
	
	String user;
	int qty;
	InventorySync2 inventory;
	
	public OrderThread2(InventorySync2 inventory,String user, int qty) {
		super();
		this.inventory=inventory;
		this.user = user;
		this.qty = qty;
	}
	public void run() {
		inventory.purchase(user, qty);
	}
	public static void main(String[] args) {
	
		InventorySync2 inv = new InventorySync2();
		
		OrderThread2 th1 = new OrderThread2(inv,"Nisha",30);
		th1.start();
		
		OrderThread2 th2 = new OrderThread2(inv,"Nisha",30);
		th2.start();
		
		OrderThread2 th3 = new OrderThread2(inv,"Nisha",50);
		th3.start();
	}
	
}
