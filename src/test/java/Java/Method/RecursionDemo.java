package Java.Method;

public class RecursionDemo {
	
	/*
	 * Recursion is a process in which a method calls itself continuously
	 * Example Below: Factorial of a number using recursion
	 */
	
	public static void main(String[] args) {
		int number = 3;
		int result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
	}
	
	static int factorial(int n) {
        if (n != 0) {  								// termination condition
            return n * factorial(n-1); 				// recursive call
        }else {
            return 1;
        }
    }
	
}
