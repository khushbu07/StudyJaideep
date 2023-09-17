package Java.OOPS.Abstraction;

/*
 * An interface in Java is a blueprint of a class.
 * It has static constants and abstract methods.
 * The interface in Java is a mechanism to achieve ABSTRACTION.
 * Interface fields(constant) are public, static and final by default, and the methods are public and abstract.
 * Base class has to use all the methods mentioned in the interface
 */

interface WaterBottleInterface{
	
	//Constant(s)
	String color = "Blue";
	
	//Abstract Method(s)
	void fillUp();
	void pourOut();
}

public class Interface_ExampleOne implements WaterBottleInterface{

	public void fillUp() {		
		System.out.println("It is filled!");
	}

	public void pourOut() {
		System.out.println("Poured out!");
	}
	
	public static void main(String[] args) {
		
		System.out.println(color);
		
		Interface_ExampleOne obj = new Interface_ExampleOne();
		obj.fillUp();
		
	}

}
