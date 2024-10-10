package practice.exceptions;

public class IllegalArgumentHandler {
	public static void main(String[] args){
		try {
			naturalNumbersCheck(-10);
		} catch (IllegalArgumentException e) {
			System.out.println("Unlocked IllegalArgumentException!");
		}
	}
	
	public static void naturalNumbersCheck(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException("How dare you pass a negative number!");
		}
	}
}


