package practice.exceptions;

public class DivisionByZeroHandler {
	public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
			System.out.println("Unlocked DivisionByZeroException!");
        }
    }
	
	public static int divide(int a, int b) {
		return a/b;
	}
}
