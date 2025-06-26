package core_java_day10;

import java.util.LinkedList;

public class OrderHistory {
	private LinkedList<Order> orders = new LinkedList<>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void printOrderHistory() {
		if (orders.isEmpty()) {
			System.out.println("No orders found.");
			return;
		}

		System.out.println("Customer Order History:");
		for (Order order : orders) {
			System.out.println(order);
		}
	}

	public Order getMostRecentOrder() {
		return orders.peekLast();
	}

	public void cancelLastOrder() {
		if (!orders.isEmpty()) {
			orders.removeLast();
			System.out.println("Most recent order canceled.");
		}
	}
}
