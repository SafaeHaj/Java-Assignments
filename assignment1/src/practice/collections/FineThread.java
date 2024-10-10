package practice.collections;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Random;

public class FineThread extends Thread {
    private String[] elementsToAdd;
    private int[] elementsToRemove;
    public static ArrayList<String> sharedArrayList = new ArrayList<>();
    public static Vector<String> sharedVector = new Vector<>();
   
    
    public FineThread(String[] elementsToAdd, int[] elementsToRemove) {
        this.elementsToAdd = elementsToAdd;
        this.elementsToRemove = elementsToRemove;
    }
    
    @Override
    public void run() {
        for (String element : elementsToAdd) {
            sharedArrayList.add(element); 
            sharedVector.add(element); 
        }
        
        for (int i : elementsToRemove) {
            try {
                sharedArrayList.remove(i);
                sharedVector.remove(i); 
            } catch (IndexOutOfBoundsException e) {
                System.out.println(Thread.currentThread().getName() + " encountered IndexOutOfBoundsException for ArrayList at index: " + i);
            }
        }
    }
}