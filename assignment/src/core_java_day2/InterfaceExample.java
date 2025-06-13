package core_java_day2;

//interface in java 8
@FunctionalInterface
interface Laptop{
	//Single abstract method
	public void showOSCode();
	public default void showLaptopSpecification() {
		System.out.println("memmory!");
	}
}
//method in interface that is  abstract till java 7
interface WashingMachine{
	public void start();
	public void pause();
	public void stop();
}
public class InterfaceExample implements  WashingMachine{

	@Override
	public void start() {
		System.out.println("start machine");
	}

	@Override
	public void pause() {
		System.out.println("m/c paused");
	}

	@Override
	public void stop() {
		System.out.println("m/c has stopped working");
	}
	
	public static void main(String[] args) {
		
	}

}