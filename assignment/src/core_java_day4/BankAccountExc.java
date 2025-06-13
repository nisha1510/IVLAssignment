package core_java_day4;

import java.util.Scanner;

public class BankAccountExc {
	private int accId;
	private String accHolderName;
	private double balance;
	
	public BankAccountExc() {
		super();
	}
	
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
			System.out.println("Account is credited by : "+amount);
			System.out.println("New balance : "+balance);
		}
		else
		{
			System.out.println("Invalid amount to deposit");
		}
	}
	void withdraw(double amount) {
		try {
			if((balance-amount)<0) 
				throw new InsufficientBalanceException("Your balance is low :"+balance);
			balance-=amount;
			System.out.println("Account is debited by : "+amount);
			System.out.println("New balance : "+balance);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
//		BankAccountExc acc = new BankAccountExc(101,"Nisha",1000);
//		acc.deposit(2000);
//		System.out.println("--------------");
//		acc.withdraw(4000);
//		System.out.println("--------------");
//		acc.deposit(2000);
//		System.out.println("--------------");
//		acc.withdraw(4000);
		
		BankAccountExc acc = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account Id :");
		int id = sc.nextInt();
		
		System.out.println("Enter Account Holder's name:");
        String name = sc.next();
        
//		System.out.println("Enter balance : ");
//		double balance=sc.nextDouble();
		
		while (true) {
            System.out.println("\nChoose Transaction: 1 for Deposit, 2 for Withdrawal, 3 to Exit");
            int transactionChoice = sc.nextInt();

            if (transactionChoice == 3) {
                System.out.println("Thank you for using our banking system! ");
                break;
            }

            System.out.println("Enter Amount:");
            double amount = sc.nextDouble();
            
            if (transactionChoice == 1) {
                acc.deposit(amount);
            } else if (transactionChoice == 2) {
                acc.withdraw(amount);
            } else {
                System.out.println(" Invalid transaction choice! Please select again.");
            }
		}
	}
}
