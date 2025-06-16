package tradingsystem;

public interface Tradeable {
	 void buyStock(String stockId, int quantity, Market market) throws Exception;
	 void sellStock(String stockId, int quantity, Market market) throws Exception;
}
