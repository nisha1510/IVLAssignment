package core_java_day4;

public class BankAccountExc {
	private int accId;
	private String accHolderName;
	private double balance;
	public BankAccountExc(int accId, String accHolderName, double balance) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
//			System.out.println(accNumber);
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
//			System.out.println(accNumber);
			System.out.println("Account is debited by : "+amount);
			System.out.println("New balance : "+balance);
		}
		else
		{
//			System.out.println(accNumber);
			System.out.println("Insufficient Balance "+ balance);
		}	
	}
	
	public static void main(String[] args) {
		BankAccountExc acc = new BankAccountExc(101,"Nisha",1000);
		acc.deposit(2000);
		System.out.println("--------------");
		acc.withdraw(4000);
		System.out.println("--------------");
		acc.deposit(2000);
		System.out.println("--------------");
		acc.withdraw(4000);;
	}
	
}
