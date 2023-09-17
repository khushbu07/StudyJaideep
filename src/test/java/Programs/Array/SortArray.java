package Programs.Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
		
		System.out.println("Array before Sorting: ");
		System.out.println(Arrays.toString(array));
		
		//Sorting
		Arrays.sort(array);
		System.out.println("Array after Sorting: ");
		System.out.println(Arrays.toString(array));

	}

}
