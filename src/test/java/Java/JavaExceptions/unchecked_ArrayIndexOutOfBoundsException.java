package Java.JavaExceptions;

import java.util.Arrays;
import java.util.List;

public class unchecked_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		//Example 1:
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		int lastNumberOne = numbers[5];
		
		//Example 2:
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
		int lastNumberTwo = numbersList.get(5);
	}
}
