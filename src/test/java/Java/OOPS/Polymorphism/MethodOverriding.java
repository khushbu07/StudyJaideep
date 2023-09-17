package Java.OOPS.Polymorphism;
/*
 * If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
 * Implementation of the method in the derived class override the implementation of the method in the base class
 */
class Bird {

	//Method(s)
	public void sing() {
		System.out.println("Bird Singing!");
	}
}

class Robin extends Bird {

	//Method(s)
	public void sing() {
		System.out.println("Robin Bird Singing!");
	}
}

class Pelican extends Bird {

	//Method(s)
	public void sing() {
		System.out.println("Pelican Bird Singing!");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Robin r = new Robin();
		r.sing();
		Pelican p = new Pelican();
		p.sing();



	}

}
