package practice.collections;
import java.util.LinkedList;

public class LinkedListQueue {
	private LinkedList<Integer> queue;
	
	public LinkedListQueue() {
        queue = new LinkedList<>();
    }
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void enqueue(int num) {
		queue.addLast(num);
	}
	
	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Sorry can't do that, queue is empty.");
		}
		int head = queue.removeFirst();
		return head;
	}
}
