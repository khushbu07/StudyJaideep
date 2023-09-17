package Programs.String;

import java.util.HashMap;

public class FirstNonRepeatingCharacterInAString {

	public static void main(String[] args) {
		firstNonRepeatedCharacter("abababcabababa");
	}
	
	public static void firstNonRepeatedCharacter(String word) {
		
		HashMap<Character, Integer> myHashMap = new HashMap<Character, Integer>(); 
		
		for(int i=0; i<word.length(); i++) {
			
			char myChar = word.charAt(i);
			
			if(myHashMap.containsKey(myChar)) {
				myHashMap.put(myChar, myHashMap.get(myChar)+1);
			}else {
				myHashMap.put(myChar, 1);
			}
		}
		
		//As HashMap does not maintain order, looping through string
		for(int j=0; j< word.length(); j++) {
						
			char myCharTwo = word.charAt(j);
			if(myHashMap.get(myCharTwo) == 1) {
				System.out.println("First Non Repeating Character is: "+myCharTwo);
				break;
			}
			
		}		
		
	}
	
}
