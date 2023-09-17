package Java.OOPS.Zz_ObjectOrientedProgramming;

public class Pens {
	
	//Defining Attributes of Pen objects
	String type = "Gel";
	String color = "Red";
	int pointer = 10;
	static boolean clicked;
	
	//Defining Methods/Actions
	public static void click() {
		clicked = true;
	}
	
	public static void unclick() {
		clicked = false;
	}
	
}
