package Programs.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWordsInAString {

	public static void main(String[] args) {
		
		String myString = "Big black bug bit a big black dog on his big black nose";
		String myStringTwo = myString.toUpperCase();
		wordCount(myString);
//		System.out.println("-----------------");
//		wordCount(myStringTwo);
	}
	
	static void wordCount(String inputString) 
    { 
        //Creating a HashMap containing char as a key and occurrences as a value 
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>(); 
  
        //Converting given string to char array  
        String[] words = inputString.split(" ");
  
        // checking each char of strArray 
        for (String word : words) { 
            if (wordCountMap.containsKey(word)) { 
  
                // If char is present in charCountMap, incrementing it's count by 1 
            	wordCountMap.put(word, wordCountMap.get(word) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value 
            	wordCountMap.put(word, 1); 
            } 
        } 
  
        // Printing the wordCountMap 
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        }
        
        //Printing the duplicate elements
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
        	
        	if(entry.getValue() > 1) {
        		System.out.println("Duplicate Element: "+entry.getKey());
        	}
        	
        }
    } 
	

}
