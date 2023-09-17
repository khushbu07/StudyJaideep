package Java.OOPS.Class;

/*
 * A class is a blueprint from which individual objects are created.
 * Class contains variables & methods.
 * 
 * Variables:
 * 1) Local variables:
 * 			Variables defined inside methods, constructors or blocks are called local variables.
 * 			The variable will be declared and initialized within the method
 * 			and the variable will be destroyed when the method has completed.
 * 2) Instance variables:
 * 			Instance variables are variables within a class but outside any method.
 * 			These variables are initialized when the class is instantiated.
 * 			Instance variables can be accessed from inside any method, constructor or blocks of that particular class.
 * 3) Class (Static) variables:
 * 			Class variables are variables declared within a class, outside any method, with the static keyword.
 * 			Each Object of Class has its own attributes that are independent from other objects
 * 			But if we want to create some shared variables between the objects then we can create Static variables.
 */

public class Aa_ConceptsOfClass {

	String name;									// Instance variable: Can only be accessed using "new" operator
	int a = 1;
	char[] chars = {'a', 'b', 'c'};

	static int age = 20;							// Class variable

	//Methods
	void info() {
		String occupation = "Pilot";				// Local variable
		System.out.println(occupation);
	}

	void printHi() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		Aa_ConceptsOfClass obj = new Aa_ConceptsOfClass();
		System.out.println(obj.a);
		obj.printHi();
		obj.info();
		
		System.out.println(Aa_ConceptsOfClass.age);
	}

}
