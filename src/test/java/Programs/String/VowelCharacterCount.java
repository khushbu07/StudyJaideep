package Programs.String;

public class VowelCharacterCount {

	public static void main(String[] args) {
		
		String myString = "This is a sample string";
		myString = myString.toLowerCase();
		int count = 0;
		
		for(int i=0; i<myString.length(); i++) {
			if(myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u' || myString.charAt(i) == 'i') {
				count++;
			}
		}
		
		System.out.println("Total number of vowels in the string are "+count);
	}

}
