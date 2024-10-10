package practice.exceptions;

public class MultipleExceptionsHandler {
	public static void main(String[] args) throws NullPointerException, ArithmeticException{
		try {
			int[] arr = null;
			int size = arr.length;
			size = 7/0;
		} catch (NullPointerException e) {
			System.out.println("Unlocked NullPointerException!");
		} catch (ArithmeticException e) {
			System.out.println("Unlocked ArithmeticException!");
		}
	}
}
