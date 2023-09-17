package Programs.Zz_Basic;

/*
 * Get the number to check for palindrome
 * Hold the number in temporary variable
 * Reverse the number
 * Compare the temporary number with reversed number
 * If both numbers are same, print "palindrome number"
 * Else print "not palindrome number"
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 123432;
		int reverse = 0;
		int temp;
		
		temp = number;
		while(temp !=0 ) {
			int digit = temp%10;
			reverse = (reverse*10)+digit;
			temp = temp/10;
		}
		
		if(number == reverse) {
			System.out.println(number+" is Palindrome");
		}else {
			System.out.println(number+" is not Palindrome");
		}
	}
	
}
