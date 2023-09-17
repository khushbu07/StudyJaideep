package Programs.Hashmap;

import java.util.*;

public class PrintAllKeysAndValues {

	public static void main(String[] args) {
		
		HashMap<Integer, String> myHashMap = new HashMap<Integer, String>();
		myHashMap.put(1, "Mango");
		myHashMap.put(2, "Apple");
		myHashMap.put(3, "Orange");
		
		//Printing Keys
		System.out.println("================================");
		System.out.println("Keys:");
		System.out.println(myHashMap.keySet());
		
		//Printing Values
		System.out.println("================================");
		System.out.println("Values:");
		System.out.println(myHashMap.values());
		
		//Printing entrySet: All at Once
		System.out.println("================================");
		System.out.println("EntrySet");
		System.out.println(myHashMap.entrySet());
		System.out.println(myHashMap);
		
		//Printing entrySet: One by One
		System.out.println("================================");
		System.out.println("Key & Value: One by One");
		for(Map.Entry entry: myHashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
