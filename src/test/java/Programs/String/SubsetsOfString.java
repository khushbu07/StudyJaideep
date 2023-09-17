package Programs.String;

/*
 * Formula: Total possible subsets for string of size n is n*(n+1)/2  
 */

public class SubsetsOfString {

	public static void main(String[] args) {
		
		String myString = "BRAG";
		int strLen = myString.length();
		int index = 0;
		int subSets = strLen*(strLen+1)/2;
		String[] subArray = new String[subSets];
		
		for(int i=0; i<strLen; i++) {								//This loop maintains the starting character  
			for(int j=i;j<strLen; j++) {							//This loop adds the next character every iteration for the subset to form and add it to the array
				subArray[index] = myString.substring(i, j+1);
				index++;
			}
		}
		
		System.out.println("Subsets of the string are: ");
		for(int i=0; i<subArray.length; i++) {
			System.out.println(subArray[i]);
		}
	}
	
	

}
