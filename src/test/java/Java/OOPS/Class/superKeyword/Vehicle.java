package Java.OOPS.Class.superKeyword;

/*
 * "super" keyword can be used for variables, methods & constructor
 * Variable "int maxSpeed" is defined in both (super & sub) classes.
 * To access variable of super class, use keyword "super"
 */


public class Vehicle {
	
	//Variables
	int maxSpeed = 100;
	
	//Constructor
	Vehicle(){
		System.out.println("Inside Vehicle Constructor!");
	};
	
	//Methods
	public void vroom() {
		System.out.println("Vehicle: vroom vroom!");
	}
	
}

class Car extends Vehicle{
	
	//Variables
	int maxSpeed = 90;
	
	//Constructor
	Car(){
		super();										//"super" will call vehicle constructor
		System.out.println("Inside Car Constructor!");	//& it has to be declared first if we want to call the vehicle cons...
	};
	
	//Methods
	public void displayVehicleMaxSpeed() {
		System.out.println(super.maxSpeed);				//Accessing "maxSpeed" variable of super class
	}
	
	public void vroom() {
		System.out.println("Car: vroom vroom!");
		super.vroom();									//Accessing "vroom" method of super class
		
	}
	
}

