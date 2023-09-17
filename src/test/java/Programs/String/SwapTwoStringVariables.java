package Programs.String;

public class SwapTwoStringVariables {

	public static void main(String[] args) {
		
		String strOne = "ABCD";
		String strTwo = "XYZ";
		System.out.println("Before Swapping: First String is "+strOne+" and Second String is "+strTwo);
		
		strOne = strOne + strTwo;
		strTwo = strOne.substring(0, (strOne.length() - strTwo.length()));
		strOne = strOne.substring(strTwo.length());
		System.out.println("After Swapping: First String is "+strOne+" and Second String is "+strTwo);	

	}
}
