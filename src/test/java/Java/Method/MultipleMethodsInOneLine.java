package Java.Method;

public class MultipleMethodsInOneLine {
		
	public static void main(String[] args) {
		
		String a = "This is a String";
		
		//Example 1
		System.out.println(a.toLowerCase().charAt(2));		//Multiple methods in one line
		
		//Example 2
		int b = a.concat(" Sample").chars().toArray()[3];
		System.out.println(b);
		
		
	}

}
