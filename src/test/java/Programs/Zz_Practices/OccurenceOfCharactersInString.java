package Programs.Zz_Practices;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharactersInString {

	public static void main(String[] args) {
		
		String myString = "SDKJBSKJD JSDBCFKJ";
		
		HashMap<Character, Integer> myHashmap = new HashMap<Character, Integer>();
		
		char[] myCharArray = myString.toCharArray();
		
		for(char c: myCharArray) {
			if(myHashmap.containsKey(c)) {
				myHashmap.put(c, (myHashmap.get(c)+1));
			}else {
				myHashmap.put(c, 1);
			}
		}
		
		for(Map.Entry entry: myHashmap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
