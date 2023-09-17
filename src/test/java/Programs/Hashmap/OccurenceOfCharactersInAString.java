package Programs.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharactersInAString {

	public static void main(String[] args) {
		
		characterCount("JAIDEEP CHOUDHARY");

	}
	
	static void characterCount(String myString) 
    { 
        // Creating a HashMap containing char as a key and occurrences as a value 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 
  
        // Converting given string to char array  
        char[] charArray = myString.toCharArray(); 
  
        // Checking each char of strArray 
        for (char c : charArray) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
        
        //Display the Hashmap
        System.out.println("Map is: "+charCountMap);
        
        // Printing the charCountMap 
        for (Map.Entry entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 
	

}
