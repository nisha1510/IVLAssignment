package tradingsystem;

public class Stock {
	private final String stockId;
	private final String stockName;
	private final double price;
	private int availableShares;
	
	public Stock(String stockId, String stockName, double price, int availableShares) {
		this.stockId=stockId;
		this.stockName=stockName;
		this.price=price;
		this.availableShares=availableShares;
	}
	
	public synchronized void buy(int qty) throws InsufficientMarketSharesException{
		if(qty > availableShares)
			throw new InsufficientMarketSharesException("Market has only "+availableShares+" Shares");
		availableShares-=qty;
	}
	public synchronized void sell(int qty) {
		availableShares+=qty;
	}

	public String getStockId() {
		return stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public double getPrice() {
		return price;
	}

	public int getAvailableShares() {
		return availableShares;
	}

	@Override
	public String toString() {
		return stockId + " - " + stockName + " | ₹" + price + " | Available: " + availableShares;
	}
	
	
}
