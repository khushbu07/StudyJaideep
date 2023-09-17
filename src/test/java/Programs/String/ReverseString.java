package Programs.String;

public class ReverseString {

	public static void main(String[] args) {
		
		String myString = "ABCDE FGHI";
		String revString = "";
		char[] chars = myString.toCharArray();
		int arrSize = chars.length;
		
		for(int i=chars.length-1; i>=0; i--) {
			char myChar = chars[i];
			revString = revString+myChar;
		}
		System.out.println(revString);
	}

}
