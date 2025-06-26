package branchapplication;

import java.util.Scanner;

public class BranchMain {

	
	public static void main(String[] args) {
		        Bank bank = new Bank();
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter number of branches: ");
		        int branchCount = Integer.parseInt(sc.nextLine());

		        for (int i = 0; i < branchCount; i++) {
		            System.out.print("\nEnter branch name: ");
		            String branchName = sc.nextLine();
		            Branch branch = new Branch(branchName);
		            bank.addBranch(branch);

		            System.out.print("Enter number of customers for " + branchName + ": ");
		            int custCount = Integer.parseInt(sc.nextLine());

		            for (int j = 0; j < custCount; j++) {
		            	
		            	System.out.println("Enter customer id");
		            	int id = sc.nextInt();
		            	sc.nextLine(); 

		            	System.out.print("Enter customer name: ");
		            	String name = sc.nextLine();

		            	System.out.println("Enter email");
		            	String email = sc.nextLine();

		            	System.out.print("Enter mobile number: ");
		            	long mobNum = sc.nextLong();
		            	sc.nextLine();

		            	System.out.println("Enter gender");
		            	String gender = sc.nextLine();

		            	System.out.println("Enter balance");
		            	double bal = sc.nextDouble();
		            	sc.nextLine(); 

		                branch.addCustomer(new Customer(id, name, email, mobNum, gender, bal));
		            }
		        }

		        System.out.print("\nWhich branch do you want to view customers for? ");
		        String targetBranch = sc.nextLine(); 

		        bank.showCustomersByBranchName(targetBranch);
		        sc.close();
		
//		Branch branch = new Branch("Hightech City Hyd");
//		branch.addCustomer(new Customer(101,"Nisha","nisha@gmail.com",97645362,"female",50000));
//		branch.addCustomer(new Customer(103,"Kranti","kranti@gmail.com",97645362,"male",60000));
//		branch.addCustomer(new Customer(104,"Manoj","manoj@gmail.com",97645362,"male",60000));
//		branch.showCustomerList();
//		System.out.println();
//		
//		Branch branch1 = new Branch("Madhapur, Hyd");
//		branch1.addCustomer(new Customer(102,"Rajani","rajani@gmail.com",97645362,"female",70000));
//		branch1.addCustomer(new Customer(105,"Anand","anand@gmail.com",97645362,"male",60000));
//		branch1.addCustomer(new Customer(106,"Sravan","sravan@gmail.com",97645362,"male",60000));
//		branch.showCustomerList();
		
//		Bank bank = new Bank();
//		
//		Branch hyd1 = new Branch("HighTech City");
//		hyd1.addCustomer(new Customer(101,"Nisha","nisha@gmail.com",97645362,"female",50000));
//		hyd1.addCustomer(new Customer(103,"Kranti","kranti@gmail.com",97645362,"male",60000));
//		hyd1.addCustomer(new Customer(104,"Manoj","manoj@gmail.com",97645362,"male",60000));
//		
//		Branch hyd2 = new Branch("Madhapur");
//		hyd2.addCustomer(new Customer(102,"Rajani","rajani@gmail.com",97645362,"female",50000));
//		hyd2.addCustomer(new Customer(105,"Anand","anand@gmail.com",97645362,"male",60000));
//		hyd2.addCustomer(new Customer(106,"Sravan","sravan@gmail.com",97645362,"male",60000));
//		
//		bank.addBranch(hyd1);
//		bank.showCustomersByBranchName("HighTech City");
//		
//		bank.addBranch(hyd2);
//		bank.showCustomersByBranchName("Madhapur");

	}

}
