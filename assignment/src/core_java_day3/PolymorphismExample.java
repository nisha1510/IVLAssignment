package core_java_day3;


class Payment{
	public void makePayment(double amount) {
		System.out.println("Processing the payment of Rs." +amount);
	}
}
class CreditCardPayment extends Payment{
	@Override
	public void makePayment(double amount) {
		System.out.println("Credit card payment of Rs." +amount + "is successful");
	}
}
class DebitCardPayment extends Payment{
	@Override
	public void makePayment(double amount) {
		System.out.println("Debit card payment of Rs." +amount + "is successful");
	}
}
class UpiPayment extends Payment{
	@Override
	public void makePayment(double amount) {
		System.out.println("UPI payment of Rs." +amount + "is successful");
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		Payment payment;
		payment = new CreditCardPayment();
		payment.makePayment(1400.50);
		payment = new DebitCardPayment();
		payment.makePayment(1400.50);
		payment = new UpiPayment();
		payment.makePayment(1400.50);
	}
}
