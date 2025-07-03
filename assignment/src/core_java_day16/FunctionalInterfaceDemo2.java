package core_java_day16;

interface A2{
	
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
public class FunctionalInterfaceDemo2 {
	public static void main(String[] args) {
		A2 obj;
	    obj = () ->System.out.println("Show");
		obj.show();
	}
}
