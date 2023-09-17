package Java.Collections.Zz_Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Convert_HashSetToArrayList {

	public static void main(String[] args) {
		
		HashSet<String> hashSetString = new HashSet<String>();
		hashSetString.add("Monkey");																//add
		hashSetString.add("Donkey");
		hashSetString.add("Elephant");
		hashSetString.add("Tiger");
		hashSetString.add("Donkey");
		System.out.println("Printing values - HashSet<String>: " + hashSetString);					//Print HashSet
		System.out.println("Printing size - HashSet<String>: " + hashSetString.size());				//Size
		
		
		//Converting HashList To List
		ArrayList<String> animalList = new ArrayList<String>(hashSetString);
		System.out.println("Printing the ArrayList: " + animalList);
		
		//Sorting the ArrayList
		Collections.sort(animalList);																//Sort
		System.out.println("Printing the ArrayList after Sorting: " + animalList);
	}
	
}
