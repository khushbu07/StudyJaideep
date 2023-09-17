package Java.Method;

public class ReturnStatement {

	public static void main(String[] args) {
		
		welcome();
		
		System.out.println("Addition of numbers is: "+add(4,5));
		
		System.out.println("Cap value of string is: "+cap("ckdhbgckhbad"));
		
		int[] myarray = createArray(2, 40, 9);
		System.out.println("Array value at Index 0 is: "+myarray[0]);
	}
	
	//Example: Return Nothing (Void)
	public static void welcome() {
		System.out.println("Welcome");
	}
	
	//Example: Return Int value
	public static int add(int a, int b) {
		return a+b;		
	}
	
	//Example: Return String value
	public static String cap(String string) {
		return string.toUpperCase();
	}
	
	//Example: Return Int Array
	public static int[] createArray(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
	
}
