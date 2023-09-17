package Java.Datatypes.Primitive;

public class TypeCasting {

	public static void main(String[] args) {
				
		/*During down casting data type is not required to be mentioned on the right side
		 *During up casting data type is required to be mentioned on the right side. Refer Example 1 
		 */
		
		//Example 1
		int a = (int) 0.5;			//Took a variable to type int and store a value of double
		
		//Example 2
		// Get the double value
        double data = 3452.345;
  
        // convert into int
        int value = (int)data;
  
        // print the int value
        System.out.println(value);
		
		
	}

}
