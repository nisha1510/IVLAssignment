package core_java_day9;

public class Cart {
	int id;
	String name;
	double value;
	
	
	public Cart(int id, String name, double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	
	
}
