package Java.Zz_JavaBasics;

import java.util.Arrays;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

/*
 * The Enum in Java is a data type which contains a fixed set of constants.
 * It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY)
 * directions (NORTH, SOUTH, EAST, and WEST),
 * season (SPRING, SUMMER, WINTER, and AUTUMN or FALL),
 * colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc.
 * According to the Java naming conventions, we should have all constants in capital letters.
 */

enum Level{											//Defined outside the class but can also be defined inside
	LOW, MEDIUM, HIGH;
}

public class EnumDemo {
	
	public static void main(String[] args) {
		
		Level l = Level.LOW;
		System.out.println(l);
		
		switch(l) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		default:
			System.out.println("Unknown level");
			break;
		}
		
		//Other
		Level[] arr = Level.values();
		System.out.println(Arrays.toString(arr));
		
	}
}
