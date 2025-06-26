package tradingsystem;

import java.util.HashMap;
import java.util.Map;

public class Market {
	
	private final Map<String, Stock> stockMap = new HashMap<>();
	
	public void addStock(Stock s) {
		stockMap.put(s.getStockId(), s);
	}
	public Stock getStock(String stockId) throws StockNotFoundException {
		Stock s = stockMap.get(stockId);
	    if (s == null)
	    	throw new StockNotFoundException("Stock ID '" + stockId + "' not found.");
	        return s;
	    }

	public void showAllStocks() {
	    System.out.println("\nMarket Stocks:");
	    stockMap.values().forEach(System.out::println);
    }
}
