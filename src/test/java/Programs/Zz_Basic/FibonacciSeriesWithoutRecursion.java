package Programs.Zz_Basic;

public class FibonacciSeriesWithoutRecursion {
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		int count = 10;
		
		System.out.print(n1 +" "+ n2); //Print the first two elements
		for(int i=3; i<=count;i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		
		
	}
}
