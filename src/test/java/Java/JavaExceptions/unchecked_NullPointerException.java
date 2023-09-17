package Java.JavaExceptions;

/*
 When we try to perform some action on the ref object which is pointing to null.
 */

public class unchecked_NullPointerException {
	
	public static void main(String[] args) {
	      Object ref = null;
	      ref.toString(); 								// this will throw a NullPointerException
	   }
	
}
