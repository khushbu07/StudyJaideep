package Java.OOPS.Zz_ObjectOrientedProgramming;

public class Headphones {
	
	//Defining Attributes
	String charge = "Micro USB";
	String[] controls = {"Power", "Volume", "Skip", "Play", "Pause"};
	String color = "Red/Black";
	
	static boolean power = false;
	static int volume = 0;
	
	//Defining Methods
	 public static void powerOn() {
		power = true;
	}
	
	 public static void powerDown() {
		power = false;
	}
	 
	 public static void volumeUp() {
		 volume++;		
	}
	
	 public static void volumeDown() {
		 volume--;
	 }
	 
}
