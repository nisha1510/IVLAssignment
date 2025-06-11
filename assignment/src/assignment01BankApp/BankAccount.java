package assignment01BankApp;

public abstract class BankAccount {
	
	protected String accHolder;
	protected String accNumber;
	protected String branchName;
	protected String adharNumber;
	protected String panNumber;
	protected double balance;
	
	public BankAccount() {}
	
	public BankAccount(String accHolder, String branchName, String adharNumber, String panNumber) {	
		this.accHolder = accHolder;
		this.branchName = branchName;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
	}
	
	public BankAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber) {	
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.branchName = branchName;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
	}
	
	public BankAccount(String accHolder, String accNumber, String branchName, String adharNumber, String panNumber,
			double balance) {
		
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.branchName = branchName;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
		this.balance = balance;
	}
	
	public abstract void openAccount();
	
//	void deposit(double amount) {
//		balance+=amount;
//		System.out.println(accNumber);
//		System.out.println("Account is credited by : "+amount);
//		System.out.println("New balance : "+balance);	
//	}
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(accNumber);
			System.out.println("Account is credited by : "+amount);
			System.out.println("New balance : "+balance);
		}
		else
		{
			System.out.println("Invalid amount to deposit");
		}
	}
	void withdraw(double amount) {
		if(amount>0 && balance>=amount) {
//		if((balance-amount)>0) {
			balance-=amount;
			System.out.println(accNumber);
			System.out.println("Account is debited by : "+amount);
			System.out.println("New balance : "+balance);
		}
		else
		{
			System.out.println(accNumber);
			System.out.println("Insufficient Balance "+ balance);
		}	
	}
}
