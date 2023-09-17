package Java.Datatypes.NonPrimitive.Array;

public class arr_TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] myTwoDArray = {{19, 23, 75}, {69, 24, 82}};
		
		System.out.println("Size of this array is: "+myTwoDArray.length);
		
		for(int i=0; i<2;i++) {
			for(int j=0; j<3; j++) {
				System.out.println(myTwoDArray[i][j]);
			}
		}

	}

}
