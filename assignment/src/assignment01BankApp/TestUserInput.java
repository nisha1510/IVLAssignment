package assignment01BankApp;

import java.util.Scanner;

public class TestUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Enter account holder's name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Branch Name:");
        String branchName = sc.nextLine();
        
		System.out.println("Enter aadhar number : ");
		String adharNo=sc.nextLine();
		
		System.out.println("Enter pancard Number : ");
		String panNo=sc.nextLine();
		
		BankAccount account = null;
		
		System.out.println("Choose Account Type: 1 for Savings, 2 for Current, 3 for Salary");
        int choice = sc.nextInt();
		
		if(choice==1) {
//			SavingsAccount sacc = new SavingsAccount(name,branchName,adharNo,panNo);
//			sacc.openAccount();
			
			account = new SavingsAccount(name,branchName,adharNo,panNo);
			account.openAccount();
			
//			System.out.println("Choose Transaction: 1 for Deposit, 2 for Withdrawal");
//	        int transactionChoice = sc.nextInt();
//	       
//	        System.out.println("Enter Amount:");
//	        double amount = sc.nextDouble();
//
//	        if (transactionChoice == 1) {
//	            sacc.deposit(amount);
//	        } else if (transactionChoice == 2) {
//	            sacc.withdraw(amount);
//	        } else {
//	            System.out.println("Invalid transaction choice!");
//	        }
		}
		else if(choice==2) {
			account= new CurrentAccount(name,branchName,adharNo,panNo);
			account.openAccount();
		}
		else if(choice==3) {
			account= new SalaryAccount(name,branchName,adharNo,panNo);
			account.openAccount();
		}
		else {
            System.out.println("Invalid choice! Please select either 1, 2 or 3.");
        }
		
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
                account.deposit(amount);
            } else if (transactionChoice == 2) {
                account.withdraw(amount);
            } else {
                System.out.println(" Invalid transaction choice! Please select again.");
            }
		}
	}
}
