package Java.Zz_JavaBasics;

//"static" keyword is used to share the same variable or method of a given class.
//It can be used with variables, methods, blocks and nested classes.
//It saves memory.
//"static" variables can be used directly by all the methods without creating an instance of the class
//using "static" keyword, we can create global variables.(Refer to variable "months")


public class StaticKeyword {

	static int a = 1;
	static int months = 12;

	public static void main(String[] args) {
		int b = 2;
		System.out.println(a);					//Accessing static variable directly
		System.out.println(b);
	}

}
