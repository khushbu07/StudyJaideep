package Java.OOPS.Polymorphism;

/*
 * A static method (class method) cannot be overridden in Java
 * but if a static method defined in the parent class is redefined in a child class,
 * the child class’s method hides the method defined in the parent class.
 * This mechanism is called method hiding in Java or function hiding.
 */


public class MethodHiding {

	public static void main(String[] args) {
		
		Vehicle VehicleOne = new MotorCycle();
		VehicleOne.engineType();						// Calling with reference. (Method hiding) 
		VehicleOne.suspensionType();					// Calling with object. (Method overriding)
		
		Vehicle VehicleTwo = new MotorCycle();
		VehicleTwo.engineType();						// Calling with reference. 
		VehicleTwo.suspensionType();					// Calling with object. 
		
		MotorCycle MotorCycle = new MotorCycle();
		MotorCycle.engineType();						// Calling with reference. 
		MotorCycle.suspensionType();					// Calling with object. 
		
		
	}
}

class Vehicle{
	
	//Method(s)
	public static void engineType() {
		System.out.println("Parent Class Static Method: Engine Type");
	}
	
	public void suspensionType() {
		System.out.println("Parent Class Non Static Method: Suspension Type");
	}
	
}

class MotorCycle extends Vehicle{
	
	//Method(s)
	public static void engineType() {
		System.out.println("Child Class Static Method: Engine Type");
	}
	
	public void suspensionType() {
		System.out.println("Child Class Non Static Method: Suspension Type");
	}
}
