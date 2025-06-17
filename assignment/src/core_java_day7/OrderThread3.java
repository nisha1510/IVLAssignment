package core_java_day7;

public class OrderThread3 extends Thread{
	
	  	private InventorySync3 inventary;
	    private Payment payment;
	    private String user;
	    private int qty;
	 
	    public OrderThread3(InventorySync3 inventary, String user, int qty, Payment payment) {
	        this.inventary = inventary;
	        this.user = user;
	        this.qty = qty;
	        this.payment = payment;
	    }
	 
	    public void run() {
	        boolean success = inventary.purchase(user, qty);
	        if (success) {
	            payment.makePayment(user, qty * 100);
	        } else {
	            System.out.println(user + " payment failed due to purchase failure.");
	        }
	    }
	 
	    public static void main(String[] args) {
	        InventorySync3 inv = new InventorySync3();
	        Payment pay = new Payment();
	 
	        OrderThread3 th1 = new OrderThread3(inv, "Pranali", 30, pay);
	        OrderThread3 th2 = new OrderThread3(inv, "Ishita", 70, pay);
	        OrderThread3 th3 = new OrderThread3(inv, "Ramya", 10, pay);
	 
	        th1.start();
	        th2.start();
	        th3.start();
	    }
	
}
