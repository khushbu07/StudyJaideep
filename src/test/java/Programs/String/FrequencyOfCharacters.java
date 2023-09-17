package Programs.String;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		String myString = "This is a Sample String";
		System.out.println("Size of string is: "+myString.length());
		
		int[] freq = new int[myString.length()];
		char[] strChars = myString.toCharArray();
		
		for(int i=0; i<myString.length(); i++) {
			freq[i]=1;
			for(int j=i+1; j<myString.length(); j++) {
				if(strChars[i] == strChars[j]) {
					freq[i]++;
					strChars[j] = '0';			
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for(int i=0; i<freq.length; i++ ) {
			if(strChars[i] != ' ' && strChars[i] != '0') {
				System.out.println(strChars[i] + "-" + freq[i]); 
			}
		}
	}	
}
