package core_java_day12;

import java.util.HashMap;
import java.util.Map;

class Product{
	
	private String name;
	private double price;
	private int stock;
	
	public Product(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock= stock;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}	
}

public class ProductInventory {
	
	public static void main(String[] args) {
		
		Map<String,Product> inventory = new HashMap<>();
		inventory.put("P001", new Product("Iphone16", 79999.0, 10));
		inventory.put("P002", new Product("Samasung galaxy s24+", 70999.00, 15));
		inventory.put("P003", new Product("OnePlus", 59999.00, 20));
		
		//Retrieve the product using productId
		String serchId = "P003";
		Product searchProduct = inventory.get(serchId);
		if(searchProduct != null) {
			System.out.println("Product Found: " +searchProduct);
		}
		else
		{
			System.out.println("Product not found");
		}
	}
}
