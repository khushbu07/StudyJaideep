package Programs.Zz_Basic;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int number = 3;
		int fact = 1;
		if(number==0 || number==1) {
			System.out.println("Factorial of "+number+" is 1");
		}else {
			for(int i=1; i<=number; i++) {
				fact = fact*i;
			}
			System.out.println("Factorial of "+number+" is "+fact);
		}

	}

}
