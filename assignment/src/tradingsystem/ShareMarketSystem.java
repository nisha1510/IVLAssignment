package tradingsystem;

import java.util.Scanner;

public class ShareMarketSystem {
	
	public static void main(String[] args) throws InterruptedException {
		 Market market = new Market();
	        market.addStock(new Stock("TCS", "Tata Consultancy", 3400.0, 100));
	        market.addStock(new Stock("INFY", "Infosys", 1400.0, 150));
	        market.addStock(new Stock("RELI", "Reliance", 2600.0, 80));

	        Scanner sc = new Scanner(System.in);

	        Trader t1 = new Trader("T001", "Alice", market, sc);
	        Trader t2 = new Trader("T002", "Bob", market, sc);

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        // Final portfolios
	        t1.printPortfolio();
	        t2.printPortfolio();

	        System.out.println("\n✅ Trading simulation complete.");
	        sc.close();
	    }
}
