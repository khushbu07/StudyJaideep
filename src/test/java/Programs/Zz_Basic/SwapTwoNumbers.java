package Programs.Zz_Basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
				
		b = b + a;
		a = b - a;
		b = b - a;
		
		System.out.printf("a is %d, b is %d", a, b); // a is 10, b is 20

	}
	
}
