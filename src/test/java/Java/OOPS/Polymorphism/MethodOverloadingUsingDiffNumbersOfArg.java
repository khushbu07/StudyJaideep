package Java.OOPS.Polymorphism;

/*
 *Method Overloading is also known as Compile time / Static Polymorphism
 *This type of polymorphism is achieved by function overloading or operator overloading. 
 */

class Multiplications{
	
	//Methods
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void multiply(int a, int b, int c) {
		System.out.println(a*b*c);
	}
}

public class MethodOverloadingUsingDiffNumbersOfArg {

	public static void main(String[] args) {
		
		Multiplications m = new Multiplications();
		m.multiply(2, 3);
		m.multiply(2, 3, 2);
	}

}
