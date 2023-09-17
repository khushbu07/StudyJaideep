package Java.Collections.Zz_Others;

import java.util.Arrays;
import java.util.HashSet;

public class Convert_HashSetToArray {

	public static void main(String[] args) {
		
		HashSet<String> hashSetString = new HashSet<String>();
		hashSetString.add("Monkey");																//add
		hashSetString.add("Donkey");
		hashSetString.add("Elephant");
		hashSetString.add("Tiger");
		hashSetString.add("Donkey");
		System.out.println("Printing values - HashSet<String>: " + hashSetString);					//Print HashSet
		System.out.println("Printing size - HashSet<String>: " + hashSetString.size());				//Size
		
		System.out.println("Converting the HashSet<String> to String[]");
		String[] arrAnimals = new String[hashSetString.size()]; 
		hashSetString.toArray(arrAnimals);															//toArray
		System.out.println("Printing String[]: " + Arrays.toString(arrAnimals));	
		
	}
}
