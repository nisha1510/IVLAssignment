package assignment01BankApp;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String accHolder, String branchName, String adharNumber, String panNumber) {	
		super(accHolder,branchName,adharNumber,panNumber);
	}
	public SavingsAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber) {	
		super(accHolder,accNumber,branchName,adharNumber,panNumber);
	}
	public SavingsAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber,
			double balance) {
		super(accHolder, accNumber, branchName, adharNumber, panNumber, balance);
	}

	@Override
	public void openAccount() {
		System.out.println("Savings Account opened successfully for "+accHolder+" at "+branchName);
		System.out.println("Available balance : "+balance);
			
	}
}

