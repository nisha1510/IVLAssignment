package tradingsystem;
import java.util.HashMap;
import java.util.Map;

public class Trader extends Thread implements Tradeable {
    private final String traderId;
    private final String name;
    private final Map<String, Integer> portfolio = new HashMap<>();
    private final Market market;
    private final boolean buying;
    private final String stockId;
    private final int quantity;

    public Trader(String traderId, String name, Market market, boolean buying, String stockId, int quantity) {
        this.traderId = traderId;
        this.name = name;
        this.market = market;
        this.buying = buying;
        this.stockId = stockId;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        try {
            if (buying) {
                buyStock(stockId, quantity, market);
            } else {
                sellStock(stockId, quantity, market);
            }
        } catch (Exception e) {
            System.err.println(name + " - Error: " + e.getMessage());
        }
    }

    @Override
    public void buyStock(String stockId, int quantity, Market market) throws Exception {
        Stock stock = market.getStock(stockId);
        stock.buy(quantity);
        portfolio.put(stockId, portfolio.getOrDefault(stockId, 0) + quantity);
        System.out.println(name + " bought " + quantity + " of " + stock.getStockName());
    }

    @Override
    public void sellStock(String stockId, int quantity, Market market) throws Exception {
        int ownedShares = portfolio.getOrDefault(stockId, 0);
        if (ownedShares < quantity) {
            throw new InsufficientSharesException(name + " does not own enough shares to sell.");
        }
        Stock stock = market.getStock(stockId);
        stock.sell(quantity);
        portfolio.put(stockId, ownedShares - quantity);
        System.out.println(name + " sold " + quantity + " of " + stock.getStockName());
    }

    public void printPortfolio() {
        System.out.println("\nPortfolio of " + name + ":");
        if (portfolio.isEmpty()) {
            System.out.println("No holdings.");
        } else {
            portfolio.forEach((id, qty) -> System.out.println(id + " - Shares: " + qty));
        }
    }
}
