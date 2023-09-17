package Java.OOPS.Class.superKeyword;

public class MainClass {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println(c.maxSpeed);				//Displaying int maxSpeed of sub class
		c.displayVehicleMaxSpeed();					//Displaying int maxSpeed of super class
		c.vroom();
	}

}
