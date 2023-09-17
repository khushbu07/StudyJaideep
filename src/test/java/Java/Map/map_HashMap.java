package Java.Map;

import java.util.HashMap;
import java.util.Map;

public class map_HashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> mapStrInt = new HashMap<String, Integer>();
		mapStrInt.put("a", 57);																//Put
		mapStrInt.put("b", 43);
		mapStrInt.put("c", 19);
		mapStrInt.put(null, 20);															//HashMap can have only one "null" key
		mapStrInt.put("d", null);															//HashMap can have multiple "null" values
		System.out.println("Values - HashMap<String, Integer>: "+mapStrInt);				//Print HashMap
		System.out.println("Size - HashMap<String, Integer>: "+mapStrInt.size());		//size
		System.out.println("Value of key \"c\": "+mapStrInt.get("c"));						//Fetching the value of key "c"
		System.out.println("Value of key \"null\": "+mapStrInt.get(null));					//Fetching the value of key "null"
		System.out.println("Value of key \"d\": "+mapStrInt.get("d"));						//Fetching the value of key "d"
		
		System.out.println("--------------------------------");
		
		HashMap<String, String> mapStrStr = new HashMap<String, String>();
		mapStrStr.put("UserJD", "Summer123#");
		mapStrStr.put("UserJCB", "Winter123#");
		System.out.println("Printing - HashMap<String, String>: "+mapStrStr);
		
		System.out.println("Removing the key - UserJCB");
		mapStrStr.remove("UserJCB");														//Removing the key "UserJCB"
		System.out.println("Printing - HashMap<String, String>: "+mapStrStr);
		
		System.out.println("ContainKey: "+mapStrStr.containsKey("UserJD"));					//ContainKey
		System.out.println("ContainValue: "+mapStrStr.containsValue("Winter123#"));			//ContainValue
		System.out.println("Size: "+mapStrStr.size());										//Size
		System.out.println("Replace: "+mapStrStr.replace("UserJD", "Autumn123#"));			//Replace
		System.out.println("Print HashMap \"mapStrStr\": "+mapStrStr);
		System.out.println("KeySet: "+mapStrStr.keySet());									//KeySet
		System.out.println("Values: "+mapStrStr.values());									//Values
		
		System.out.println("--------------------------------");
		
		System.out.println("EntrySet");
		System.out.println(mapStrStr.entrySet());
		
		System.out.println("--------------------------------");
		
		System.out.println("Key & Value: One by One");
		for(Map.Entry<String, String> entry: mapStrStr.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());						//getKey() & getValue() 
		}
		
	}	
}
