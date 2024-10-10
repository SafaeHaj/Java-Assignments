package practice.collections;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomObjectSorting {
	public static void main(String[] args) {
		// These are completely accurate stats on the iliad leading stars
		 ArrayList<Hero> iliadHeroes = new ArrayList<>(Arrays.asList(
		            new Hero("Achilles", 100, 100, 65),
		            new Hero("Agamemnon", 90, 70, -100),
		            new Hero("Odysseus", 80, 100, 95),
		            new Hero("Diomedes", 95, 90, 80),
		            new Hero("Hector", 90, 90, 70),
		            new Hero("Paris", 0, 5, 0)
		        ));
		 
		System.out.println("Unsorted heroes list: "+ iliadHeroes);
		iliadHeroes.sort((hero1, hero2) -> hero1.getAverage().compareTo(hero2.getAverage()));
		System.out.println("Sorted heroes list: "+ iliadHeroes);
	}
}
