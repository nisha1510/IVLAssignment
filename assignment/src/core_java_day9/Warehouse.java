package core_java_day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warehouse {
	
	static String[] productSlots = new String[100];
	
	public void storeProduct(int slot, String product) {
		productSlots[slot] = product;
	}
	public String getProduct(int slot) {
		return productSlots[slot];
	}
	
	public static void main(String[] args) {
		
		Warehouse warehouse = new Warehouse();
		warehouse.storeProduct(20, "Shampoo");
		System.out.println(warehouse.getProduct(20));
		
		List<String> productList = new ArrayList<>(Arrays.asList(productSlots));
		System.out.println(productList);
		int totalProducts = productList.size();
		System.out.println("ArrayList size : "+totalProducts);
	}
}
