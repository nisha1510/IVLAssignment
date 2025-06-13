package core_java_day3;

class BankAccount{
	private String acc_holder_name;
	private double balance;
	public BankAccount(String acc_holder_name, double balance) {
		super();
		this.acc_holder_name = acc_holder_name;
		this.balance = balance;
	}
	public String getAcc_holder_name() {
		return acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount > 0) { balance += amount;}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) { balance -= amount;}else
		{
			System.out.println("Invalid Request!");
		}
	}
}
public class BankSystem {
public static void main(String[] args) {
	BankAccount account = new BankAccount("Preetti",10000);
	account.deposit(2000);
	account.withdraw(7000);
	System.out.println("Balance" +account.getBalance());
}
}