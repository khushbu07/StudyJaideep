package Java.JavaExceptions;

/*
 * Thrown when anything that a calculator could not process.
 * 
 * 1. When divided by 0.
 * 2. 
 */

public class unchecked_ArithmeticException {

	public static void main(String args[])
	{
		try{
			//Example 1:
//			int num1=30, num2=0;
//			int output=num1/num2;
//			System.out.println ("Result: "+output);

			//Example 2:
			System.out.println(0 / 1);
			
		}
		catch(ArithmeticException e){
			System.out.println ("You Shouldn't divide a number by zero");
		}
	}

}
