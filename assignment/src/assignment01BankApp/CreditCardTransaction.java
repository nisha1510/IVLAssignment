package assignment01BankApp;

public class CreditCardTransaction implements Transaction{

	@Override
	public void processPayment(double amount) {
		System.out.println("CreditCard payment of "+amount+" processed! ");
	}

}
