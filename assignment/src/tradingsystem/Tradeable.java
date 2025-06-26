package tradingsystem;

public interface Tradeable {
	
	void buyStock(String stockId, int qty, Market market) throws Exception;
    
	void sellStock(String stockId, int qty, Market market) throws Exception;
}
