package Java.Collections.List;

import java.util.Vector;

public class list_Vector {

	public static void main(String[] arg) {
  
        // Case 1: Creating a default vector
        Vector v1 = new Vector();								
        v1.add(1);												// add: Adding custom elements
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);
        System.out.println("Vector v1 is " + v1);				// Printing the vector elements to the console
  
        // Case 2 :Creating Iteger vector
        Vector<Integer> v2 = new Vector<Integer>();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println("Vector v2 is " + v2);
        System.out.println("Vector v2 size is: " + v2.size());
        
        v2.set(0, 11);											// set
        System.out.println("Vector v2 is " + v2);
    }
	
}
