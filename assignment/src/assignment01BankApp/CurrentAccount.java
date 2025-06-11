package assignment01BankApp;

public class CurrentAccount extends BankAccount{
	
	public CurrentAccount(String accHolder, String branchName, String adharNumber, String panNumber) {	
		super(accHolder,branchName,adharNumber,panNumber);
	}
	public CurrentAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber) {	
		super(accHolder,accNumber,branchName,adharNumber,panNumber);
	}
	public CurrentAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber,
			double balance) {
		super(accHolder, accNumber, branchName, adharNumber, panNumber, balance);
	}

	@Override
	public void openAccount() {
		System.out.println("Current Account opened successfully for "+accHolder+" at "+branchName);
		System.out.println("Available balance : "+balance);
	}
}
