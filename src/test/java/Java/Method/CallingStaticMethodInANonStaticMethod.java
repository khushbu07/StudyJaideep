package Java.Method;

public class CallingStaticMethodInANonStaticMethod {

	private static int aStaticVariable = 1;
	private int aNonStaticVariable = 2;

	private static void aStaticMethod() {
		//Callin a non-static variable and non-static method by creating an instance of class
		CallingStaticMethodInANonStaticMethod classObject = new CallingStaticMethodInANonStaticMethod();
		System.out.println(classObject.aNonStaticVariable);
		classObject.aNonStaticMethod();
	}

	private void aNonStaticMethod() {
		System.out.println(aStaticVariable);
	}
	
	//Main Method
	public static void main(String[] args) {
		aStaticMethod();
	}

}
