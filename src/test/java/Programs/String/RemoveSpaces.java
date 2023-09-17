package Programs.String;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String myString = "This Is A Sample String";
		String newStringOne = myString.replaceAll("\\s+", "");
		System.out.println("New String after removing spaces is: "+newStringOne);
		
		//Replace " " with a character "#"
		String newStringTwo = myString.replaceAll("\\s+", "#");
		System.out.println("New String after replacing space with # is: "+newStringTwo);
		
		//remove leading and trailing whitespaces
		String myStringThree = " ABC DEF ";
		//myStringThree = myStringThree.strip();
		System.out.println("After removing leading and trailing whitespaces: "+"X"+myStringThree+"X");
		
//		String myStringFour = "ABC12HGHKS6765";
//		String temp = myStringFour.replace("\\^[a-zA-Z]*$", "#");
//		System.out.println(temp);
	}

}
