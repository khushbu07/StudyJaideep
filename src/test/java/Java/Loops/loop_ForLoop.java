package Java.Loops;

public class loop_ForLoop {

	public static void main(String[] args) {
		
		//Example 1
		System.out.println("Example 1: Value of i");
		for(int i=0; i<=10; i++) {
			System.out.print(i + " | ");
		}
		
		//Example 2: With Array
		System.out.println("");
		System.out.println("Example 2: String Array");
		String[] fruits = {"Mango", "Apple", "Banana"};
		for(int j=0; j<fruits.length; j++) {
			System.out.print(fruits[j] + " | ");
		}
	}

}
