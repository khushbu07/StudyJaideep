package Programs.String;

public class PrintStringCharacters {

	public static void main(String[] args) {
		
		String myString = "Jaideep Choudhary";
		
		for(int i=0; i<myString.length(); i++) {
			
			char myChar = myString.charAt(i);
			System.out.print(myChar);
			
		}

	}

}
