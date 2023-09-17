package Java.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class q_ArrayDeque {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> adStr = new ArrayDeque<String>();
		adStr.push("first");
		adStr.push("second");
		System.out.println(adStr);
	 
	    ArrayDeque<Integer> adInt = new ArrayDeque<Integer>(10);
	    adInt.add(10);																// add
        adInt.add(20);
        adInt.add(30);
        adInt.add(40);
        adInt.add(50);
        System.out.println("Values: " + adInt);										// Printing values
        System.out.println("Size: " + adInt.size());								// size
 
        System.out.println("Using clear() ");
        adInt.clear();																// clear
        System.out.println("Values after clearing: " + adInt);						// Printing values
        System.out.println("Size after clearing: " + adInt.size());					// size
        
        adInt.addFirst(564);														// addFirst
        adInt.addFirst(291);
        adInt.addLast(24);															// addLast
        adInt.addLast(14);
        
        System.out.println("Iterator: ");
        for (Iterator<Integer> itr = adInt.iterator(); itr.hasNext();) {			// Iterator
            System.out.println("Value is: " + itr.next());
        }
        
        System.out.println("descendingIterator: ");
        for (Iterator dItr = adInt.descendingIterator(); dItr.hasNext();) {			// descendingIterator
            System.out.println(dItr.next());
        }
 
        System.out.println("Element(): " + adInt.element());						// element()
        System.out.println("getFirst(): " + adInt.getFirst());						// getFirst()
        System.out.println("getLast(): " + adInt.getLast());						// getLast()
        
        Object[] arr = adInt.toArray();												// toArray()
        System.out.println("toArray(): " + Arrays.toString(arr));
 
        System.out.println("peek()");												// peek()
        adInt.peek();
        System.out.println("Values: " + adInt);										// Printing values
        System.out.println("Size: " + adInt.size());								// size
        System.out.println("Values: " + adInt);										// Printing values
        System.out.println("Size: " + adInt.size());								// size
        
        System.out.println("poll():");												// poll()
        adInt.poll();	
        
        System.out.println("push()");
        adInt.push(265);															// push
        adInt.push(984);
        adInt.push(2365); 
        System.out.println("Values: " + adInt);										// Printing values
        System.out.println("Size: " + adInt.size());								// size
        
        System.out.println("remove()");
        adInt.remove();																// remove()
        System.out.println("Values after remove(): " + adInt);						// Printing values
        System.out.println("Size after remove(): " + adInt.size());					// size
        
        System.out.println("pop()");
        adInt.pop();																// pop()
        System.out.println("Values after pop(): " + adInt);							// Printing values
        System.out.println("Size after pop(): " + adInt.size());					// size
    }
}
