package core_java_day10;

public class OrderMain {
	    public static void main(String[] args) {
	        OrderHistory history = new OrderHistory();

	        history.addOrder(new Order("ORD01", "Laptop", 1, 50000));
	        history.addOrder(new Order("ORD02", "Cargar", 2, 800));
	        history.addOrder(new Order("ORD03", "Keyboard", 1, 1500));

	        history.printOrderHistory();

	        System.out.println("\nMost Recent Order: " + history.getMostRecentOrder());

	        history.cancelLastOrder();
	        history.printOrderHistory();
	    }
	}
