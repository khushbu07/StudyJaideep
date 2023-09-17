package Java.JavaExceptions;

/*
 * when an attempt is made to convert a string with improper format into a numeric value.
 * That means, when it is not possible to convert a string in any numeric type (float, int, etc), this exception is thrown.
 */

public class unchecked_NumberFormatException {
	
	public static void main(String[] args) {
	
		//Example 1:
		Integer.parseInt("null") ;
		
		//Example 2:
		Integer abc=new Integer(" 432 ");
		
		//Example 3:
		Float.parseFloat("");
		
		//Example 4:
		double d = Double.parseDouble("ThirtyFour");
	}
	
}
