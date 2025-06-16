package tradingsystem;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Market {

    private final Map<String, Stock> stocks = new ConcurrentHashMap<>();

    public void addStock(Stock stock) {
        stocks.put(stock.getStockId(), stock);
    }

    public Stock getStock(String stockId) throws StockNotFoundException {
        Stock stock = stocks.get(stockId);
        if (stock == null) {
            throw new StockNotFoundException("Stock ID " + stockId + " not found in market.");
        }
        return stock;
    }

    public void displayMarket() {
        System.out.println("\nMarket Summary:");
        for (Stock stock : stocks.values()) {
            System.out.println(stock.getStockName() + " | Shares Available: " + stock.getAvailableShares());
        }
    }
}
