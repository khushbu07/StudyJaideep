package Java.Method;

public class MethodParameters {

	public static void main(String[] args) {
		saySomething("Hi JD");
		saySomething("Hola JD");
		printInfo("JD", 31);
		printInfo("Mike", 39);
		addnumbers(2,3);
	}
	
	public static void saySomething(String s) {
		System.out.println(s);
	}
	
	public static void printInfo(String name, int age) {
		System.out.println(name+" is "+age+" year old!");
	}
	
	public static void addnumbers(int a, int b) {
		System.out.println("Addition of "+a+","+b+" is: "+(a+b));
	}
	
}
