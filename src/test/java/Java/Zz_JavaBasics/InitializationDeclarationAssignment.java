package Java.Zz_JavaBasics;

public class InitializationDeclarationAssignment {

	public static void main(String[] args) {
		
		/*
		 * Declaration is the point at which you create a variable
		 * Initialization is when assign data to a variable for the first time.
		 * Assignment is whenever you’re storing data in the variable.
		 */
				
		String var_One;						//Declaration
		var_One = "ABC";					//Initialization
		var_One = "DEF";					//Assignment
				
		//Other Examples:		
		int a; // declaration
		int b = 5; // declaration
		a = 6; // not a declaration
		b = 7; // not a declaration
		
		int c; // not an initialization
		int d = 5; // initialization
		c = 6; // initialization
		d = 7; // not an initialization
		
		int e; // not an assignment
		int f = 5; // assignment
		e = 6; // assignment
		f = 7; // assignment
		
	}
}
