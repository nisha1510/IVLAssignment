package core_java_day7;

public class InventorySync {
	
	private int stock = 100;
	
	public synchronized void purchase(String user, int qty) {
		if(stock>=qty) {
			System.out.println(user+" purchased "+qty+" item ");
			stock-=qty;
			System.out.println(stock);
		}
		else
		{
			System.out.println("trying to purchase "+qty+ ", remaining stock : "+stock);
		}
	}

	public int getStock() {
		return stock;
	}

//	public void setStock(int stock) {
//		this.stock = stock;
//	}
	
}
