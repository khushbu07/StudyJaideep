package Java.Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class q_PriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();  
		pq.add("Jaideep");													// add
		pq.add("Ravi");
		pq.add("Yogesh");
		pq.add("Saggi");
		System.out.println("Values: " + pq);								// Printing the PriorityQueue
		System.out.println("Size: "+pq.size());								// size
		System.out.println("Element: " + pq.element());						// element
		System.out.println("Peek: " + pq.peek());							// peek
		
		System.out.println("Iterator: ");
		Iterator<String> it = pq.iterator();								// Iterator
		while(it.hasNext()) {
			System.out.println("Value is: " + it.next());
		}
		
		System.out.println("Remove");
		pq.remove();														// remove
		System.out.println("Values: " + pq);								// Printing the PriorityQueue
		System.out.println("Poll");
		pq.poll();															// poll
		System.out.println("Values: " + pq);								// Printing the PriorityQueue
		
	}
	
}
