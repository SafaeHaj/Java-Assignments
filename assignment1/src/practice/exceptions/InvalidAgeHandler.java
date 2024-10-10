package practice.exceptions;

public class InvalidAgeHandler {	
	public static void main(String[] args) {
		try {
			User dave = new User();
			dave.setAge(150);
		} catch(InvalidAgeException e) {
			System.out.println("Unlocked InvalidAgeException!");
		}
	}
}
