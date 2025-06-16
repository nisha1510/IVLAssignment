package tradingsystem;

public class ShareMarketSystem {
	
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        market.addStock(new Stock("TCS", "Tata Consultancy Services", 3600, 100));
        market.addStock(new Stock("INFY", "Infosys", 1400, 150));
        market.addStock(new Stock("RELI", "Reliance", 2400, 80));

        Trader trader1 = new Trader("T1", "Nisha", market, true, "TCS", 20);
        Trader trader2 = new Trader("T2", "Rajani", market, true, "INFY", 25);
        Trader trader3 = new Trader("T3", "Chandu", market, false, "RELI", 5); // Should fail (no stock yet)
        Trader trader4 = new Trader("T4", "Pranali", market, true, "RELI", 40);

        trader1.start();
        trader2.start();
        trader3.start();
        trader4.start();

        // Wait for all threads to finish
        trader1.join();
        trader2.join();
        trader3.join();
        trader4.join();

        // Final portfolios
        trader1.printPortfolio();
        trader2.printPortfolio();
        trader3.printPortfolio();
        trader4.printPortfolio();

        // Market Summary
        market.displayMarket();
    }
}
