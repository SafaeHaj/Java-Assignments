package practice.exceptions;

public class ArrayIndexHandler {
	public static void main(String args[]) {
		int[] arr = {0, 1, 2, 3};
		try {
			getArrayElem(arr, -1);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Unlocked ArrayIndexOutOfBoundsException!");
		}
	}
	
	public static int getArrayElem(int[] arr, int idx) {
		return arr[idx];
	}
}
