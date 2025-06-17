package core_java_day7;

public class OrderThread extends Thread{
	
	String user;
	int qty;
	InventorySync inventory;
	
	public OrderThread(InventorySync inventory,String user, int qty) {
		super();
		this.inventory=inventory;
		this.user = user;
		this.qty = qty;
	}
	public void run() {
		inventory.purchase(user, qty);
	}
	public static void main(String[] args) {
	
		InventorySync inv = new InventorySync();
		
		OrderThread thread = new OrderThread(inv,"Nisha",30);
		thread.start();
		
		OrderThread thread1 = new OrderThread(inv,"Nisha",80);
		thread1.start();
	}
	
}
