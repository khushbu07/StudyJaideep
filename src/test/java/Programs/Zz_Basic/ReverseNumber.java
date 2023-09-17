package Programs.Zz_Basic;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 692389;
		int revnum = 0;
		
		while(num != 0) {
			int digit = num%10;
			revnum = (revnum*10)+digit;
			num = num/10;
		}
		System.out.println("Reverse number: "+ revnum);

	}

}
