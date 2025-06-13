package core_java_day3;

class Customer{
	 String name ;
}
public class CustomerCopyCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "Preetti";

		Customer c2 = new Customer();
		c2.name = c1.name;
		c2.name = "Sachin";
		System.out.println(c1.name);
		System.out.println(c2.name);
	}
}
