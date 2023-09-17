package Java.Datatypes.NonPrimitive.Array;

import java.util.Arrays;

public class Aa_ConceptsOfArray {

	public static void main(String[] args) {

		// Declare and Allocate memory
		String[] arrStr = new String[100];
		System.out.println("Size of String Array: "+ arrStr.length);					//length

		// Declare an Array
		double[] arrDbl;

		// Allocate memory
		arrDbl = new double[10];
		System.out.println("Size of Double Array: "+ arrDbl.length);

		// Declare and Initialize an array
		int[] age = {12, 4, 5, 2, 5};
		System.out.println("Size of Int Array: "+ age.length);
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth Element: " + age[3]);
		System.out.println("Fifth Element: " + age[4]);

		// For Loop
		System.out.println("Using for Loop:");
		for(int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		
		// toStrings
		System.out.println(Arrays.toString(age));											//toString
		
		

	}
}
