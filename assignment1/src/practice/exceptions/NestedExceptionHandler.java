package practice.exceptions;

public class NestedExceptionHandler {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Unlocked nested Exception!");
		}
	}
	public static void method1() throws Exception{
		method2(); 
	}
	
	public static void method2() throws Exception{
		throw new Exception("Error in nested method!");
	}
}
