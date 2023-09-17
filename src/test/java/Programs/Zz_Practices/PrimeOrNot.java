package Programs.Zz_Practices;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		int myNumber = 107;
		int halfOfNumber = myNumber/2;
		int flag = 0;
		
		if(myNumber == 0 || myNumber == 1) {
			System.out.println("Number: "+myNumber+" is not a prime number");
		} else {
			for(int i=2; i<=halfOfNumber; i++) {
				if(myNumber%i == 0) {
					System.out.println("Number: "+myNumber+" is a not prime number");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Number: "+myNumber+" is a prime number");
			}
		}
	}
}
