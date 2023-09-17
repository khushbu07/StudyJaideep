package Java.Zz_JavaBasics;

interface Animal{
	
	//Methods
	public void eat();
}

class Dog implements Animal{

	public void eat() {
		System.out.println("Eating!");
	}
	
}

class Bird{
	
	//Method
	public void sing() {
		System.out.println("Singing!");
	}
}

class Sparrow extends Bird{
	
}

public class InstanceOfKeyword {

	public static void main(String[] args) {
		
		Sparrow s = new Sparrow();
		Sparrow s2 = null;
		System.out.println(s instanceof Bird);			//return true if left side object is instance of class/interface mentioned on right side
		System.out.println(s2 instanceof Bird);
		
		Dog d = new Dog();
		System.out.println(d instanceof Animal);
	}

}
