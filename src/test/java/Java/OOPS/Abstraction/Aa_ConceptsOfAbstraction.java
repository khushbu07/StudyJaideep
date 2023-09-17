package Java.OOPS.Abstraction;

/*
 * Explanation: 
 * Abstraction is a process of hiding the implementation details and showing/providing only functionalities/services to the user.
 * That is, it provides the basic idea of methods that a class should have that extends it 
 * but no code can be implemented in the abstract methods.
 * 
 * Example: Calculator
 * Calculator contains the logic to perform various mathematics operations.
 * 
 * Abstraction can be achieved in 2 ways:
 * ==>> Using Abstract Class: It is class which is declared with "abstract" keyword.
 * 			1) Contains at least one abstract method.
 * 			2) Can contain non-abstract methods.
 * 			3) Implementation of the methods are written inside the derived class.
 * 			4) Can not create an object of abstract class using new operator.
 * 			5) Can have parameterized constructor.
 * 			6) Can have the "main" method.
 * 			7) Can contain non-final variables
 * 			8) Access Specifier - private, protected and public
 * ==>> Using Interface: It is basically a blueprint of the class where abstract methods are defined.
 * 			1) It is used to achieve the total abstraction.
 * 			2) Variables in the interface are final, public and static.
 * 			3) Access Specifier - public
 * 			4) Abstract Methods are by default public in Interface.
 * 			5) NEW FEATURES (After JDK 8)
 *				A) Defaults Methods: 
 *					- Using Default methods, we can add more methods to the interface		
 *					without impacting the existing classes implement the interface. 
 *				B) Static Method:
 *					- Static methods are similar to the default methods except we can not override these method
 *					in the classes that implements these interfaces.
 * 
 * Benefits:
 * 1) Increase the re-usability of the code.
 * 2) Increase Security: As the internal code is not made available to the end user. 
 * 3) Increase maintainability. 
 *
 *
 *Diff B/W Interface & Abstract Class
 *1) 
 *	Abstract class can have abstract and non-abstract methods.
 *	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
 *2)
 *	Abstract class doesn't support multiple inheritance.
 *	Interface supports multiple inheritance.
 *3)
 *	Abstract class can have final, non-final, static and non-static variables.
 *	Interface has only static and final variables.
 *4)
 *	An abstract class can extend another Java class and implement multiple Java interfaces.
 *	An interface can extend another Java interface only.
 *5)
 *	A Java abstract class can have class members like private, protected, etc.
 *	Members of a Java interface are public by default.
 *	
 *
 *
 *
 *
 *
 *
 *
 */


public class Aa_ConceptsOfAbstraction {

}
