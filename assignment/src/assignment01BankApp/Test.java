package assignment01BankApp;

public class Test {

	public static void main(String[] args) {
		SavingsAccount sacc = new SavingsAccount("Nisha J","23456","Hyd hightech city","436788244151","BVWPJ5680B",50000);
		sacc.openAccount();
		sacc.deposit(2000);
		sacc.withdraw(53000);
		
		CurrentAccount cacc = new CurrentAccount("Disha J","23457","Hyd hightech city","436788244152","BVWPJ5680C",50000);
		cacc.openAccount();
		cacc.deposit(2000);
		cacc.withdraw(53000);
	}
}
