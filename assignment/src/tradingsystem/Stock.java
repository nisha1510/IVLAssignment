package tradingsystem;

public class Stock {
    private final String stockId;
    private final String stockName;
    private final double pricePerShare;
    private int availableShares;

    public Stock(String stockId, String stockName, double pricePerShare, int availableShares) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.pricePerShare = pricePerShare;
        this.availableShares = availableShares;
    }

    public synchronized void buy(int quantity) throws InsufficientMarketSharesException {
        if (quantity > availableShares) {
            throw new InsufficientMarketSharesException("Market has insufficient shares of " + stockName);
        }
        availableShares -= quantity;
    }

    public synchronized void sell(int quantity) {
        availableShares += quantity;
    }

    public String getStockId() { return stockId; }
    public String getStockName() { return stockName; }
    public double getPricePerShare() { return pricePerShare; }
    public int getAvailableShares() { return availableShares; }
}
