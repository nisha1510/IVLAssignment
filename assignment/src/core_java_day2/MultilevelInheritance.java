package core_java_day2;

public class MultilevelInheritance {

	public static void main(String[] args) {	  
		Bill1 bill1 = new Bill1("nisha", "Dell vostro", "Laptop", 55000.0, 2);
		bill1.displayBill();
	}
}

//Base Class
class Customer1 {
	String name;
	String contact;

	Customer1(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}

	void displayCustomer() {
		System.out.println("Customer Name: " + name);
		System.out.println("Contact: " + contact);
 }
}

//Intermediate Class
class Product extends Customer1 {
 String productName;
 double price;
 int quantity;

 Product(String name, String contact, String productName, double price, int quantity) {
     super(name, contact);
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }

 void displayProduct() {
     System.out.println("Product Name: " + productName);
     System.out.println("Price: " + price);
     System.out.println("Quantity: " + quantity);
 }
}

//Derived Class
class Bill1 extends Product {

 Bill1(String name, String contact, String productName, double price, int quantity) {
     super(name, contact, productName, price, quantity);
 }

 double calculateTotal() {
     return price * quantity;
 }

 void displayBill() {
     System.out.println("\n----- BILL DETAILS -----");
     displayCustomer();
     displayProduct();
     System.out.println("Total Amount: " + calculateTotal());
     System.out.println("------------------------");
 }
}
