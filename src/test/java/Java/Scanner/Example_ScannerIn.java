package Java.Scanner;

import java.util.Scanner;

public class Example_ScannerIn {

	public static void main(String[] args) {
		
	    // creates an object of Scanner
	    Scanner input = new Scanner(System.in);
	    
	    //Method: nextLine()
	    System.out.print("Enter your name: ");
	    String name = input.nextLine();						// nextLine()
	    System.out.println("My name is " + name);		
	    
	    //Method: next()
	    System.out.print("Enter any word: ");
	    String word = input.next();							// next()
	    System.out.println("Word is: " + word);			
	    
	    System.out.print("Enter any int value: ");
	    int intValue = input.nextInt();						// nextInt()
	    System.out.println("Int value is: " + intValue);
	    
	    input.close();										// close()
	}	
}
