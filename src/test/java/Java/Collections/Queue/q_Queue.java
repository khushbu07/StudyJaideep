package Java.Collections.Queue;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class q_Queue {
	
	public static void main(String[] args) {
		
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.add("Tom");																		//add
		myQueue.add("Thomas");
		myQueue.add("Harvey");
		myQueue.add("Hailey");
		System.out.println("Printing values of Queue<String>: "+ myQueue);						//Print myQueue
		System.out.println("Printing size of Queue<String>: "+ myQueue.size());					//Print size of myQueue
		
		System.out.println("Peek Queue<String>" + myQueue.peek());								//peek
		System.out.println("Printing values of Queue<String>: "+ myQueue);						//Print myQueue
		
		System.out.println("Poll Queue<String>" + myQueue.poll());								//poll
		System.out.println("Printing values of Queue<String>: "+ myQueue);						//Print myQueue
		
		System.out.println("Printing size of Queue<String>: "+ myQueue.size());					//Print size of myQueue
		
		System.out.println("Queue<String> contains?: " + myQueue.contains("Whitney"));			//contains
		
		System.out.println("Queue<String> toArray: " + Arrays.toString(myQueue.toArray()));		//toArray
		System.out.println("Queue<String> toArray: " + myQueue.toArray()[1]);					//toArray
		
	}
	
}
