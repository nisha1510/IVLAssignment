package core_java_day16;

interface A{
	
	void show();
}
//class Calc implements A{
//
//	@Override
//	public void show() {
//		System.out.println("Showing the calculation");
//	}
//	
//}
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		A obj;
		obj = new A() // Anonymous class
				{
 
					@Override
					public void show() {
						System.out.println("Show");
					}
				};
		obj.show();
	}
}
