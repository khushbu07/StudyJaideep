package Programs.Array;

public class SortArrayAscDesc {

	public static void main(String[] args) {

		int[] myArray = new int[] {89,31,45,11,77,88,45,24};
		int temp = 0;

		//Display the Array Elements in original order
		System.out.print("Original Order: ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}

		System.out.println();

		//Asc Sorting
		for(int i=0; i<myArray.length; i++) {
			for(int j=i+1; j<myArray.length; j++) {
				if(myArray[i] > myArray[j]) {
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		//Display the Array Elements in Asc order
		System.out.print("Asc Order: ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}
		
		System.out.println();
		
		//Desc Sorting
		for(int i=0; i<myArray.length; i++) {
			for(int j=i+1; j<myArray.length; j++) {
				if(myArray[i] < myArray[j]) {
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		//Display the Array Elements in Desc order
		System.out.print("Desc Order: ");
		for(int i=0; i<myArray.length; i++) {
			System.out.print(myArray[i]+" ");
		}


	}

}
