package Java.Method;

public class Methods {

	public static void main(String[] args) {
		welcome();
		add(2,3);
		multiple(2, 3);
	}
	
	public static void welcome() {
		System.out.println("Welcome :)");
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void multiple(int a, int b) {
		System.out.println(a*b);
	}
}
