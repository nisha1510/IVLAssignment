package assignment01BankApp;

public class UPITransaction implements Transaction{

	@Override
	public void processPayment(double amount) {
		System.out.println("UPI Transaction for "+amount+" successful.");
	}
}

