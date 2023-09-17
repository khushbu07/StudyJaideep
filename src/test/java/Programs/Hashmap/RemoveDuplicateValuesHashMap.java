package Programs.Hashmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RemoveDuplicateValuesHashMap {

	public static void main(String[] args) {

		Map<String, String> myMap = new TreeMap<String, String>();
		myMap.put("1", "One");
		myMap.put("2", "Two");
		myMap.put("3", "One");
		myMap.put("4", "Three");
		myMap.put("5", "Two");
		myMap.put("6", "Three");
		myMap.put("7", "Four");
		myMap.put("8", "Four");
		myMap.put("9", "Five");

		System.out.println("=== Before Removing Duplicate Values ===");
		System.out.println("mymap :" + myMap);
		System.out.println("-----------------------------------------------------------");

		Set<String> mySet = new HashSet<String>();
		Iterator<Entry<String, String>> it = myMap.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();

			String value = entry.getValue();

			if (mySet.contains(value)) {
				it.remove();
			} else {
				mySet.add(value);
			}

		}

		System.out.println("=== After Removing Duplicate Values ===");
		System.out.println("mymap :" + myMap);

	}

}
