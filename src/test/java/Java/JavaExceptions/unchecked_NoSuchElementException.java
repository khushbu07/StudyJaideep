package Java.JavaExceptions;

import java.util.HashMap;
import java.util.Iterator;

/*
 * When we try to access an element which does not exist.
 * 
 */

public class unchecked_NoSuchElementException {

	public static void main(String[] args) {
		
		//Example 1:
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();			// creating an hashmap object
        Iterator itr = map.keySet().iterator();						// creating an iterator
        itr.next();													// trying to access the element
		
	}
}
