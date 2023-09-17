package Java.OOPS.Class;

/*
 * Typically, we use a constructor to give initial values to the class variable.
 * Types:
 * 		1. No argument Constructors
 * Example:
 * Public class MyClass {
 *    Int num;
 *    MyClass() {
 *      num = 100;
 *   }
 *}
 *Callin: MyClass t1 = new MyClass();
 *
 *		2. Parameterized Constructors
 *Example:
 *class MyClass {
 *   int x;
 *   MyClass(int i) {
 *      x = i;
 *   }
 *}
 *Calling: 
 *	MyClass t1 = new MyClass(10);
 *	MyClass t2 = new MyClass(20);         
 */

public class Class_Constructor {

	public static void main(String[] args) {
		Shirts shirt = new Shirts("Purple", 'L');  //Here Shirt(); is the default constructor even when it is not defined in the Shirts class
		System.out.println(shirt.color);
		shirt.putOn();
		shirt.takeOff();
		shirt.setColor("Blue");
		shirt.setSize('L');
		System.out.println(shirt.color);
		
		
		Shirts shirtt = new Shirts();

	}
}

class Shirts {

	//Defining Attributes
	public String color;
	public char size;

	//Defining Constructor
	Shirts(String newColor, char newSize){
		System.out.println("Constructor with paramenter");
		color = newColor;
		size = newSize;
	};
	
	Shirts(){
		System.out.println("Constructor without paramenter");
	}
	
	//Defining Methods
	public void putOn() {
		System.out.println("Shirt is On!");
	}

	public void takeOff() {
		System.out.println("Shirt is taken Off!");
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public void setSize(char newSize) {
		size = newSize;
	}

}

