package Java.Collections.List;

import java.util.Iterator;
import java.util.LinkedList;

public class list_LinkedList {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();							//Raw Linked list
		l.add("ROB");												//add
		l.add("SAM");
		l.add("KIN");
		l.add("TOM");
		System.out.println(l);										//Print all the list members		
		l.remove();													//remove: remove the front/first (eg: ROB in this case)
		System.out.println(l);		
		System.out.println(l.getFirst());							//getFirst
		
		LinkedList<String> ls = new LinkedList<String>();			//String Linked List
		ls.add("MANGO");						
		ls.add("APPLE");
		ls.add("BANANA");
		ls.add(2, "ORANGE");
		System.out.println(ls);
		ls.clear();													//clear
		System.out.println(ls);
		
		LinkedList<Integer> li = new LinkedList<Integer>();			//Integer Linked List
		li.add(21);
		li.add(38);
		li.add(43);
		System.out.println(li.get(2));								//get(index)
		
		//Iterating the Linked List
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
