package Java.Loops;

import java.util.ArrayList;

public class loop_ForEach {

	public static void main(String[] args) {

		//Normal For Loop
		System.out.println("Example: Normal For Loop");
		for(int i=0; i<5; i++) {
			System.out.print(i + " | ");
		}

		//Example 2: With Array
		System.out.println("");
		System.out.println("Example 2: Normal For Loop - String Array");
		String[] fruits = {"Mango", "Apple", "Banana"};
		for(int j=0; j<fruits.length; j++) {
			System.out.print(fruits[j] + " | ");
		}

		//Enhanced For Loop
		//Example 1: String Array
		System.out.println("");
		System.out.println("Example 1: Enhanced For Loop - String Array");
		String[] cars = {"BMW","AUDI","JAGUAR","VOLVO"};
		for(String car:cars){
			System.out.print(car + " | ");
		}

		//Example 2: Char Array
		System.out.println("");
		System.out.println("Example 2: Enhanced For Loop - Char Array");
		char[] bikes = {'A', 'E', 'G'};
		for(char bike:bikes){
			System.out.print(bike + " | ");
		}

		//Example 3: Integer ArrayList
		System.out.println("");
		System.out.println("Example 3: Enhanced For Loop - Integer ArrayList");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(23);
		numbers.add(34);
		numbers.add(67);
		numbers.add(13);
		for(int number:numbers) {
			System.out.print(number + " | ");
		}		

	}

}
