package core_java_day2;

public class SingleInheritance {

	 public static void main(String[] args) {
	     Bill bill = new Bill(101, "Nisha", 250.00, 0.18);
	     bill.displayBill();
	 }

}
//Parent class
class Customer {
	int customerId;
	String customerName;

	Customer(int id, String name) {
		customerId = id;
		customerName = name;
	}
	
	void displayCustomerInfo() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
	}
}

//Child class
class Bill extends Customer {
	
	double amount;
	double tax;
	double total;

	Bill(int id, String name, double amount, double taxRate) {
		super(id, name);
		this.amount = amount;
		this.tax = amount * taxRate;
		this.total = amount + this.tax;
	}

	void displayBill() {
		displayCustomerInfo();
		System.out.println("Amount : " + amount);
		System.out.println("Tax : " + tax);
		System.out.println("Total Amount : " + total);
	}
}
