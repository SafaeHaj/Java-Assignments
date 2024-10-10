package practice.exceptions;

public class ChainedExceptionsHandler {
	public static void main(String[] args) throws InvalidInputException {
		try {
			int num = stringToInt("Why do you only call me when you're high?");
		} catch (NumberFormatException e) {
            throw new InvalidInputException("Unlocked NumberFormatException! Which is caused by InvalidInput!", e);
		}
	}
	
	public static int stringToInt (String s) {
		return Integer.parseInt(s);
	}
}
