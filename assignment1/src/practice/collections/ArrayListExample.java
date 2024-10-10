package practice.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.addAll(0, Arrays.asList("Rolling", "in", "the", "deep", "oooooh"));
		Iterator<String> iter = strList.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}
}
