package Programs.String;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LowerCaseToUpperCaseViceVersa {

	public static void main(String[] args) {
		
		String myString = "AbCdEfgHiJ kLmNoPqR";
		StringBuffer newString = new StringBuffer(myString);
		
//		System.out.println(newString);
		
		for(int i=0; i<myString.length(); i++) {
			
			if(Character.isLowerCase(myString.charAt(i))) {
				newString.setCharAt(i, Character.toUpperCase(myString.charAt(i)));
			}else if (Character.isUpperCase(myString.charAt(i))) {
				newString.setCharAt(i, Character.toLowerCase(myString.charAt(i)));
			}			
		}
		System.out.println("My String is: "+myString);
		System.out.println("New String is: "+newString);
	}
}
