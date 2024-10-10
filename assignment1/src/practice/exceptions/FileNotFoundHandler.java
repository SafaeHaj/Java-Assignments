package practice.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundHandler {
	public static void main(String[] args) {
		try {
			readFile();
		} catch(FileNotFoundException e) {
			System.out.println("Unlocked FileNotFoundException!");
		}
	}
	
	public static void readFile() throws FileNotFoundException{
		File f = new File("my_file.txt");
		Scanner fileRead = new Scanner(f);
		fileRead.close();
	}
}
