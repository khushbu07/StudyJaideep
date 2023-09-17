package Java.OOPS.Abstraction;

abstract class Dogs {
	
	//Variable(s)
	String breed;
	
	public void bark() {						//Non Abstract Method in Abstract class
		System.out.println("Abstract Class Method: bark()");
	}
	
	public abstract void eat();					// Abstract Method in Abstract class
	
}

class Pug extends Dogs{

	@Override
	public void eat() {							// Abstract methods has to be implemented in the class that extends it
		System.out.println("SubClass Method: eat()");	
	}
	
}

public class AbstractClass_ExampleOne {

	public static void main(String[] args) {	//Abstract class "Dog" can not be directly instantiated here
		
		Pug pug = new Pug();					// To access "Dog" class, create another class (eg: Pug) that extends to Dog
		pug.bark();								// And create an instant of extended class (Pug)
		pug.eat();
		

	}

}
