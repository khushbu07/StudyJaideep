package Programs.String;

import java.util.Arrays;

/*
 * Two Strings are called the anagram if they contain the same characters. Sequence can be different.
 * 
 * Algo:
 * DEFINE str1 = "Brag", str2 = "Grab".
 * CONVERT str1, str2 to lower-case.
 * IF length of str1, str2 are not equal then PRINT "Not Anagram" else go to next step
 * CONVERT str1, str2 to character arrays.
 * SORT the arrays.
 * COMPARE the arrays, IF equal then PRINT "Anagram" else Print "Not Anagram"
 */

public class AnagramStrings {

	public static void main(String[] args) {
		
		//Define 2 strings
		String s1 = "Brag";
		String s2 = "Grab";
		
		//Convert both strings to lowercase
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			System.out.println("Strings are not Anagram");
		}else {
			
			//Convert to char array
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			//Sort both arrays
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Strings are Anagram");
			}else {
				System.out.println("Strings are not Anagram");
			}
			
		}

	}

}
