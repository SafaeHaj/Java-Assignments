package practice.collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesRemoval {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(11, 2, 2, 12, 3, 3, 1, 11));
		HashSet<Integer> set = new HashSet<>(l);
		
		System.out.println("Original List: " + l + "\nNo Duplicates: " + set);
	}
}
