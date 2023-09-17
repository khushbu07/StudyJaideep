package Programs.String;

public class PalindromeString {

	public static void main(String[] args) {
		
		String myString = "A B C B A";		
		String revString = "";
		
		for(int i=myString.length()-1; i>=0; i--) {
			char chr = myString.charAt(i);
			revString = revString+chr;
		}
		System.out.println("Reverse string is: "+revString);
		
		if (myString.equals(revString)) {
			System.out.println("Given string is Palindrome");
		}else {
			System.out.println("Given string is not Palindrome");
		}
	}

}
