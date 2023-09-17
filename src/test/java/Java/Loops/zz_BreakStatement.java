package Java.Loops;

public class zz_BreakStatement {

	public static void main(String[] args) {

		//Example 1
		int i=0;
		while(i<3) {
			System.out.println("Hey!");
			i++;
			break;
		}

		//Example 2
		int[] numbers = {11, 13, 82, 63, 76};
		for(int j=0; j<numbers.length; j++) {

			if(numbers[j]==82) {
				break;
			}
			System.out.println(numbers[j]);
		}

		//Example 3
		int k=2;
		switch(k) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Unknow number");
			break;
		}

	}

}
