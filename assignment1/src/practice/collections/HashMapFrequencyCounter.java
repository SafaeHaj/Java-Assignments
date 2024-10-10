package practice.collections;
import java.util.HashMap;
public class HashMapFrequencyCounter {
	public static void main(String[] args) {
		HashMap<Character, Integer> charFrequency = frequencyCounter("Wouldn't you like a taste of the power?");
		System.out.println(charFrequency);
	}
	
	public static HashMap<Character, Integer> frequencyCounter(String str) {
		HashMap<Character, Integer> chF = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!Character.isLetter(c))
				continue;
		    chF.put(c, chF.getOrDefault(c, 0) + 1);
		}
		return chF;
	}
}
