package Java.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

/*
 * To store unique set of values
 * 
 */


public class set_HashSet {

	public static void main(String[] args) {

		HashSet<String> hashSetString = new HashSet<String>();
		hashSetString.add("Monkey");																//add
		hashSetString.add("Donkey");
		hashSetString.add("Elephant");
		hashSetString.add("Tiger");
		hashSetString.add("Donkey");
		System.out.println("Printing values - HashSet<String>: " + hashSetString);					//Print HashSet
		System.out.println("Printing size - HashSet<String>: " + hashSetString.size());				//Size
		
		System.out.println("Removing the value - Donkey from HashSet<String>");
		hashSetString.remove("Donkey");
		System.out.println("Printing values - HashSet<String>: " + hashSetString);					//Print HashSet		
		System.out.println("Contains the value - Donkey?: " + hashSetString.contains("Donkey"));	//Contains
		
		System.out.println("Clearing HashSet<String>");
		hashSetString.clear();																		//Clear
		System.out.println("Printing values - HashSet<String>: "+hashSetString);					//Print HashSet
		
		System.out.println("HashSet<String> IsEmpty?: " + hashSetString.isEmpty());					//IsEmpty
		
		System.out.println("--------------------------------");
		
		HashSet<Integer> hashSetInteger = new HashSet<Integer>();
		hashSetInteger.add(3);
		hashSetInteger.add(18);
		System.out.println("Printing values - HashSet<Integer>: " + hashSetInteger);				//Print HashSet
		System.out.println("Printing size - HashSet<Integer>: " + hashSetInteger.size());			//Size
		
		System.out.println("Converting the HashSet<Integer> to Object[]");
		Object[] arrObj = hashSetInteger.toArray();													//toArray
		System.out.println("Printing the value of second element of Object[]: " + arrObj[1]);		
		
		System.out.println("HashCode: " + hashSetInteger.hashCode());								//hashCode
		
		System.out.println("Iteration of HashSet<Integer> using Iterator Class");					//Iteration
		Iterator<Integer> it = hashSetInteger.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}

	}
}
