package Programs.Array;

public class SumZero {

	public static void main(String[] args) {
		
		int[] myArray = createArray(2);
		
		System.out.println("Printing Array:");
		for(int k=0; k<myArray.length; k++) {
			System.out.print(myArray[k]+" ");
		}
		
	}

	public static int[] createArray(int n){

		int halfNumber = n/2;
		int[] myIntArray = new int[n];
		int value = halfNumber * (-1);

		if(n%2==0){
			System.out.println("Given number is Even");
			for(int i = 0; i<n; i++){
				if(value == 0) {
					value++;
					i--;
				}else {
					myIntArray[i] = value;
					value++;
				}
			}
		}else{
			System.out.println("Given number is Odd");
			value = halfNumber * (-1);
			for(int i = 0; i<n; i++){
				myIntArray[i] = value;
				value++;         
			}
		}
		
		return myIntArray;
	}
}
