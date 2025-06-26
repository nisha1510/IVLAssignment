package core_java_day9;

import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList<String> product = new ArrayList<>();
	
	public void addProduct(String item) {
		product.add(item);
	}
	public void removeProduct(String item) {
		product.remove(item);
	}
	
	public void showProduct() {
		for(String cartItem : product) {
			System.out.println(cartItem);
		}
	}
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addProduct("charger");
		cart.addProduct("laptop");
		cart.showProduct();
		cart.removeProduct("laptop");
		System.out.println();
		cart.showProduct();
	}
}
