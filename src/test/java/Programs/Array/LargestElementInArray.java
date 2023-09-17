package Programs.Array;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] myArray = new int[] {23,73,923,38,81};
		
		//Largest Element
		int max = myArray[0];
		for(int i=0; i<myArray.length; i++) {
			if(myArray[i] > max) {
				max = myArray[i];
			}
		}
		System.out.println("Largest element is: "+max);
		
		//Smallest Element
		int min = myArray[0];
		for(int i=0; i<myArray.length; i++) {
			if(myArray[i] < min) {
				min = myArray[i];
			}
		}
		System.out.println("Smallest element is: "+min);
		
		//Sum of all elements
		int sum = 0;
		for(int i=0; i<myArray.length; i++) {
			sum = sum + myArray[i];
		}
		System.out.println("Sum of all element is: "+sum);
		
	}

}
