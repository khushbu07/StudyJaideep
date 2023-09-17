package Programs.Array;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int[] myArray = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		System.out.println("Duplicate Elements are:");
		for(int i=0; i<myArray.length; i++) {
			for(int j=i+1; j<myArray.length; j++) {
				if(myArray[i] == myArray[j]) {
					System.out.println(myArray[j]);
				}
			}
		}

	}
}
