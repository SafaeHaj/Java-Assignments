package practice.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionHandler {
	public static void main(String[] args) {
		try {
			readFirstLineFromFile("src/text.txt");
		} catch (IOException e) {
	    	System.out.println("Unlocked IOException!");
	    }
	}
	
	static String readFirstLineFromFile(String path) throws IOException {
	    try (FileReader fr = new FileReader(path);
	         BufferedReader br = new BufferedReader(fr)) {
	        return br.readLine();
	    } 
	}	
}
