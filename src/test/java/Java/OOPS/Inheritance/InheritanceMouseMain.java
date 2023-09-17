package Java.OOPS.Inheritance;

public class InheritanceMouseMain {
	
	/*
	 * It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.
	 * Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
	 * Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
	 * Example: 
	 * Parent Class: Animal
	 * Child Classes: Cats & Dogs
	 * Now both (Cats & Dogs) can make use of its own methods and properties as well as of Animal class
	 */
	
	public static void main(String[] args) {
		
		System.out.println("----- First Mouse -----");
		MouseOne mOne = new MouseOne();
		mOne.leftClick();
		mOne.rightClick();
		mOne.scrollUp();
		mOne.scrollDown();
		mOne.setColor("Blue");
		
		System.out.println("----- Second Mouse -----");
		MouseTwo mTwo = new MouseTwo();
		mTwo.leftClick();
		mTwo.rightClick();
		mTwo.scrollUp();
		mTwo.scrollDown();
		mTwo.connectBluetooth();
		
		System.out.println("----- Third Mouse -----");
		MouseThree mThree = new MouseThree();
		mThree.leftClick();
		mThree.rightClick();
		mThree.scrollUp();
		mThree.scrollDown();
		System.out.println(mThree.ambientTexture);

	}

}
