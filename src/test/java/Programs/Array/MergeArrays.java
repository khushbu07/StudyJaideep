package Programs.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class MergeArrays {

	public static void main(String[] args) {

		int[] firstArray = {1,2,3,4,5,6};        							//source array  
		int[] secondArray = {4,5,6,7,8,9};  								//destination array  
		int firstArrayLength = firstArray.length;        					//determines length of firstArray  
		int secondArrayLength = secondArray.length;   						//determines length of secondArray  

		int[] mergedArray = new int[firstArrayLength + secondArrayLength];  //resultant array of size first array + second array  
		
		//Copying the Elements of firstArray & secondArray in mergedArray
		//System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);
		System.arraycopy(firstArray, 0, mergedArray, 0, firstArrayLength);	  
		System.arraycopy(secondArray, 0, mergedArray, firstArrayLength, secondArrayLength); 
		
		System.out.println("Merged Array:");
		System.out.println(Arrays.toString(mergedArray));    				//prints the resultant array  
		
		System.out.println("Merged Array after removing the duplicate:");
		removeDuplicates(mergedArray);
	}
	
	//Using HashSet
	public static void removeDuplicates(int[] a)
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		// Print the elements of LinkedHashSet
		System.out.print(set);
	}
	
}
