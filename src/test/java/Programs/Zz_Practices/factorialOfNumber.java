package Programs.Zz_Practices;

public class factorialOfNumber {

	public static void main(String[] args) {
		
		int fact = 1;
		int myNumber = 3;
		
		if(myNumber == 0 || myNumber == 1) {
			System.out.println("Factorial is 1");
		}else {
			for(int i=1; i<=myNumber; i++) {
				fact = fact*i;
			}
			System.out.println("Factorial is: "+ fact);
		}
		

	}

}
