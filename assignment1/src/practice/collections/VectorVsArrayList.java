package practice.collections;

public class VectorVsArrayList {
	public static void main(String[] args) throws InterruptedException {		
		String[] thread1Add = {"I", "can", "take", "the", "suffering", "from", "you"};
		String[] thread2Add = {"Ooooh", "can't", "you", "let", "me", "stay", "dry"};
		
		int[] thread1Remove = {0, 3, 5, 7};
		int[] thread2Remove = {1, 2, 4, 6, 8};
		
		FineThread thread1 = new FineThread(thread1Add, thread1Remove);
		FineThread thread2 = new FineThread(thread2Add, thread2Remove);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
	    thread2.join();
		
	    System.out.println("Final State!");
		System.out.println(FineThread.sharedArrayList); 
		System.out.println(FineThread.sharedVector);
	}
}
