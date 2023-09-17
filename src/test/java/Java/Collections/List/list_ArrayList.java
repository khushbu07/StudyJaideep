package Java.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/*
 * arrays are linear data structures providing functionality to add elements in a continuous manner 
 * in memory address space whereas ArrayList is a class belonging to the Collection framework.
 * 
 * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
 * (if you want to add or remove elements to/from an array, you have to create a new one).
 * While elements can be added and removed from an ArrayList whenever you want.
 * 
 * Elements in an ArrayList are actually objects. In the example: "fruitList", we created elements (objects) of type "String".
 * Remember that a String in Java is an object (not a primitive type).
 * To use other types, such as int, you must specify an equivalent wrapper class: Integer.
 * For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
 * 
 */


public class list_ArrayList {

	public static void main(String[] args) {
		
		//Array
		String[] fruits = new String[3];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Mango";
		System.out.println("Displaying Array: " + Arrays.toString(fruits));
		System.out.println("Displaying the size of Array: " + fruits.length);
		System.out.println("Displaying 3rd element of Array: " + fruits[2]);
		System.out.println("----------------------------------------");
		
		//Array List
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Kiwi");																		//add
		fruitList.add("Blueberry");
		fruitList.add("Strawberry");
		fruitList.add("Mango");
		System.out.println("ArrayList Elements: " + fruitList);										//print arraylist
		System.out.println("ArrayList Size: " + fruitList.size());									//size
		
		Collections.sort(fruitList);																//sort
		System.out.println("ArrayList after Sorting: " + fruitList);
		
		System.out.println("ArrayList second element: " + fruitList.get(1));						//get		
		
		fruitList.remove("Kiwi"); //Removing an element in the ArrayList							//remove
		System.out.println("ArrayList Elements after removing Kiwi: " + fruitList);
		System.out.println("ArrayList Size after removing Kiwi: " + fruitList.size());
		
		fruitList.remove(0);																		//remove : using index
		System.out.println("ArrayList Elements after removing 0th element: " + fruitList);
		System.out.println("ArrayList Size after removing 0th element: " + fruitList.size());
		
		fruitList.set(0, "Banana");
		System.out.println("ArrayList after setting the 0th element to Banana: " + fruitList);		//set		
		
		fruitList.clear(); //Clearing the ArrayList													//clear
		System.out.println("ArrayList Elements after Clearing: " + fruitList);
		System.out.println("ArrayList Size after Clearing: "+ fruitList.size());
		//Checking if an element exist in the ArrayList
		System.out.println("Checking if ArrayList contains Kiwi: " + fruitList.contains("Kiwi"));	//contains
		
		System.out.println("----------------------------------------");
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);

	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.print(i + " | ");
	    }
		
	}

}
