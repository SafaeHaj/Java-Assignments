package practice.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionCopyExample {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1994, 9, 7));
		ArrayList<Integer> copycat = new ArrayList<>(Arrays.asList(1997, 19, 8));
		
		Collections.copy(copycat, l);
		
		System.out.println(copycat);
		System.out.println(l);
	}
}
