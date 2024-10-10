package practice.collections;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		int[] array = {12, 123, 1, 2, 34, 4, 3, 3, 2, 3, 1};
        TreeSet<Integer> uniqueSortedTest = uniqueSort(array); 
        System.out.println(uniqueSortedTest);
	}
	
	public static TreeSet<Integer> uniqueSort(int[] array) {
		TreeSet<Integer> uniqueSorted = new TreeSet<>();
		for (int i = 0; i < array.length; i++) {
			uniqueSorted.add(array[i]);
		}
		
		return uniqueSorted;
	}
}
