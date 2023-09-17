package Programs.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrayTwo {

	public static void main(String[] args) {

		int[] firstArray = {1,2,3,4,5,6};        //source array  
		int[] secondArray = {4,5,6,7,8,9};  //destination array  
		int firstArrayLength = firstArray.length;        //determines length of firstArray  
		int secondArrayLength = secondArray.length;   //determines length of secondArray 

		int[] tempArray = new int[firstArrayLength + secondArrayLength];

		//Copying the Elements of firstArray & secondArray in mergedArray
		//System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);
		System.arraycopy(firstArray, 0, tempArray, 0, firstArrayLength);  
		System.arraycopy(secondArray, 0, tempArray, firstArrayLength, secondArrayLength);
		
		System.out.println("Printing tempArray:");
		System.out.println(Arrays.toString(tempArray));    //prints the resultant array

		Set<Integer> mySet = new HashSet<Integer>();

		//Adding elements to HashSet
		for (int i = 0; i < tempArray.length; i++) {
			mySet.add(tempArray[i]);
		}
		
		//Print the elements of LinkedHashSet
		System.out.println("Printing mySet:");
		System.out.println(mySet);
		
		Object[] mergedArray = mySet.toArray();
		System.out.println("Printing mergedArray:");
		System.out.println(Arrays.toString(mergedArray));
		
	}

}
