package assignment01BankApp;

public class SalaryAccount extends BankAccount{
	
	public SalaryAccount(String accHolder, String branchName, String adharNumber, String panNumber) {	
		super(accHolder,branchName,adharNumber,panNumber);
	}
	public SalaryAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber) {	
		super(accHolder,accNumber,branchName,adharNumber,panNumber);
	}
	
	public SalaryAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber,
			double balance) {
		super(accHolder, accNumber, branchName, adharNumber, panNumber, balance);
	}

	@Override
	public void openAccount() {
		System.out.println("Salary account opened successfully...");
		System.out.println("Available balance : "+balance);
	}
}
