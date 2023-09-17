package Java.JavaExceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * It is thrown when a method is called at incorrect time.
 */


public class unchecked_IllegalStateException {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        List al = new ArrayList();
        al.add("Sachin");
        al.add("Rahul");
        al.add("saurav");
        Iterator it = al.iterator();  
        while (it.hasNext()) {           
//        	it.next();								//Commenting
            it.remove();							//removing the element without moving to first position 
        }
	}
}
