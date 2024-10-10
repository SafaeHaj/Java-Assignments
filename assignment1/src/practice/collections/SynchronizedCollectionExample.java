package practice.collections;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SynchronizedCollectionExample {
    public static void main(String[] args) {
    	 List<String> bandsList = new ArrayList<>(Arrays.asList(
    	            "The Beatles",
    	            "Led Zeppelin",
    	            "Queen",
    	            "The Rolling Stones",
    	            "Pink Floyd",
    	            "The Doors",
    	            "Nirvana",
    	            "AC/DC",
    	            "The Who",
    	            "U2",
    	            "Aerosmith",
    	            "Metallica",
    	            "Fleetwood Mac",
    	            "Red Hot Chili Peppers",
    	            "Guns N' Roses"
    	        )); 
        
        List<String> syncBandsList = Collections.synchronizedList(bandsList);

        
        synchronized(syncBandsList) {
            for (String band: syncBandsList) {
                System.out.println(band);
            }
        }
    }
}
