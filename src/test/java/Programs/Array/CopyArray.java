package Programs.Array;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] arrOne = new int[] {1,2,3,4,5};
		int[] arrTwo = new int[arrOne.length];
		
		for(int i=0; i<arrOne.length; i++) {
			arrTwo[i] = arrOne[i];
		}
		
		System.out.println("Print Array One");
		for(int i=0; i<arrOne.length; i++) {
			System.out.println(arrOne[i]);
		}
		
		System.out.println("Print Array Two");
		for(int i=0; i<arrTwo.length; i++) {
			System.out.println(arrTwo[i]);
		}

	}
}
