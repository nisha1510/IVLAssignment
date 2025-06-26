package core_java_day10;

public class Order {
    private String orderId;
    private String product;
    private int quantity;
    private double price;

    public Order(String orderId, String product, int quantity, double price) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Product: " + product +
               ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}
