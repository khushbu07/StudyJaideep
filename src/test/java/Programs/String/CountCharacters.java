package Programs.String;

public class CountCharacters {

	public static void main(String[] args) {
		
		String myString = "This is a sample string";
		int count = 0;
		
		for(int i=0; i<myString.length(); i++) {
			if(myString.charAt(i) != ' ') {
				count++;
			}
		}
		
		System.out.println("Total number of characters in the string is: "+count);
	}

}
