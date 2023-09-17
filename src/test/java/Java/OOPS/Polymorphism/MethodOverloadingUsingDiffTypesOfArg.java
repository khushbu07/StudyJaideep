package Java.OOPS.Polymorphism;

/*
 *Method Overloading is also known as Compile time / Static Polymorphism
 *This type of polymorphism is achieved by function overloading or operator overloading. 
 */

class MathOperations{
	
	//Methods
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void multiply(double a, double b) {
		System.out.println(a*b);
	}
}

public class MethodOverloadingUsingDiffTypesOfArg {
	
	public static void main(String[] args) {
		
		MathOperations mo = new MathOperations();
		mo.multiply(2, 3);
		mo.multiply(2.1, 3.5);
		
	}
}
