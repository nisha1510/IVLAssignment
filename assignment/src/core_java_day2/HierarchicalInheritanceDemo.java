package core_java_day2;

class Vehicle{
	String brand;
	String model;
	
	public Vehicle(String brand, String model) {
		this.brand=brand;
		this.model= model;
	}
	void startEngine() {
		System.out.println(brand +" "+ model +" started");
	}
}

class Car extends Vehicle{
	
	Car(String brand, String model) {
        super(brand, model);
    }
    void openTrunk() {
        System.out.println(brand + " " + model + " trunk is open.");
    }
}

class Truck extends Vehicle {
	
    Truck(String brand, String model) {
        super(brand, model);
    }
    void load() {
        System.out.println(brand + " " + model + " is loading.");
    }
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		Car car = new Car("Kia", "EV6");
        Truck truck = new Truck("Volvo", "FH16");

        car.startEngine();
        car.openTrunk();

        truck.startEngine();
        truck.load();

	}

}
