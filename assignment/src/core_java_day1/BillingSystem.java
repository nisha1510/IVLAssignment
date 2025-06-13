package core_java_day1;

public class BillingSystem {
	String cust_name;
	double bill_amount;
		
	public BillingSystem(String cust_name, double bill_amount) {
		this.cust_name = cust_name;
		this.bill_amount = bill_amount;
	}
	
	public static double calculateTaxBill(double amount) {
		double taxRate = 0.18;
		return amount*taxRate ;
	}
	
	public static double getDiscount(double amount) {
		return amount * 0.10;
	}
	
	public void generateBill() {
		double tax = calculateTaxBill(bill_amount);
		double total = tax + bill_amount;
		System.out.println("Customer name : "+cust_name);
		System.out.println("Bill amount : "+bill_amount);
		System.out.println("tax : "+tax);
		System.out.println("Total : "+total);
	}
	
	public static void main(String[] args) {
		BillingSystem bs = new BillingSystem("Nisha",1000);
		bs.generateBill();
	}
}
