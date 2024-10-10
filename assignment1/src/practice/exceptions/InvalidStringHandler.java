package practice.exceptions;

public class InvalidStringHandler {
	public static void main(String[] args) {
		try {
			int num = toInt("One is the loneliest number you'll ever do~");
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Unlocked NumberFormatException!");
		}
	}
	
	public static int toInt(String s) {
		return Integer.parseInt(s);
	}
}
