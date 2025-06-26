package tradingsystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Trader extends Thread implements Tradeable {
	private final String traderId;
    private final String name;
    private final Map<String, Integer> portfolio = new HashMap<>();
    private final Market market;
    private final Scanner sc;

    public Trader(String traderId, String name, Market market, Scanner sc) {
        this.traderId = traderId;
        this.name = name;
        this.market = market;
        this.sc = sc;
    }

    @Override
    public void run() {
        System.out.println("\n👤 Trader " + name + " started trading.");

        synchronized (sc) { // Prevents Scanner conflicts across threads
            market.showAllStocks();

            try {
                System.out.print(name + " → Buy or Sell (B/S)? ");
                String action = sc.next().toUpperCase();

                System.out.print("Enter Stock ID: ");
                String stockId = sc.next();

                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                if (action.equals("B")) {
                    buyStock(stockId, qty, market);
                } else if (action.equals("S")) {
                    sellStock(stockId, qty, market);
                } else {
                    System.out.println("Invalid action.");
                }
            } catch (Exception e) {
                System.err.println("❌ [" + name + "] " + e.getMessage());
            }
        }
    }

    @Override
    public void buyStock(String stockId, int qty, Market market) throws Exception {
        Stock s = market.getStock(stockId);
        s.buy(qty);
        portfolio.put(stockId, portfolio.getOrDefault(stockId, 0) + qty);
        System.out.println("✅ " + name + " bought " + qty + " of " + s.getStockName());
    }

    @Override
    public void sellStock(String stockId, int qty, Market market) throws Exception {
        if (portfolio.getOrDefault(stockId, 0) < qty)
            throw new InsufficientSharesException("Not enough shares to sell.");
        Stock s = market.getStock(stockId);
        s.sell(qty);
        portfolio.put(stockId, portfolio.get(stockId) - qty);
        System.out.println("💸 " + name + " sold " + qty + " of " + s.getStockName());
    }

    public void printPortfolio() {
        System.out.println("\n📁 Portfolio of " + name);
        if (portfolio.isEmpty()) {
            System.out.println("No holdings.");
        } else {
            portfolio.forEach((k, v) -> System.out.println(k + " → " + v + " shares"));
        }
    }

}
