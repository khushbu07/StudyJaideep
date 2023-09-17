package Java.Method;

/*
 * A static method (class method) cannot be overridden in Java
 * but if a static method defined in the parent class is redefined in a child class,
 * the child class’s method hides the method defined in the parent class.
 * This mechanism is called method hiding in Java or function hiding.
 */


public class CallingWithReferenceAndObject {

	public static void main(String[] args) {
		
		System.out.println("----------Accessing MotorCycle Methods---------");
		Vehicle VehicleOne = new MotorCycle();
		VehicleOne.suspensionType();
		
		MotorCycle MotorCycleOne = new MotorCycle();
		MotorCycleOne.suspensionType();
		MotorCycleOne.engineType();		

		
		System.out.println("----------Accessing Vehicle Methods---------");
		Vehicle VehicleTwo = new Vehicle();
		VehicleTwo.suspensionType();
		
		MotorCycle MotorCycleTwo = (MotorCycle) new Vehicle();				//Need to cast
		MotorCycleTwo.suspensionType();
		
	}
}

class Vehicle{
	
	public void suspensionType() {
		System.out.println("Vehicle: Suspension Type");
	}
	
}

class MotorCycle extends Vehicle{
		
	public void suspensionType() {
		System.out.println("Motorcycle: Suspension Type");
	}
	
	public void engineType() {
		System.out.println("Motorcycle: Engine Type");
	}
}
