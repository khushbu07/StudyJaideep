package Java.OOPS.Abstraction;

/*
 * Interface is basically a blueprint of a class. 
 * It can have static constants and abstract methods.
 * Through Interface, we can achieve 100% Abstraction
 */


//Interface
interface Animal {
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

public class Interface_ExampleTwo implements Animal{

	public void animalSound() {
		System.out.println("The pig says: wee wee");		
	}

	public void sleep() {
		System.out.println("Zzz");		
	}	
	
	public static void main(String[] args) {
		Interface_ExampleTwo myPig = new Interface_ExampleTwo();  // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}

}
