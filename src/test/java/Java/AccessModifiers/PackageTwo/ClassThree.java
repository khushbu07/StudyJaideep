package Java.AccessModifiers.PackageTwo;

import Java.AccessModifiers.PackageOne.ClassOne;

public class ClassThree {

	public static void main(String[] args) {

		//Import ClassOne
		ClassOne classOne = new ClassOne();

		//Accessing the variable from ClassOne		
//		System.out.println("Default variable from ClassOne: " + classOne.defaultString);
		System.out.println("Public variable from ClassOne: " + classOne.publicString);
//		System.out.println("Protected variable from ClassOne: " + classOne.protectedString);
//		System.out.println("Private variable from ClassOne: " + classOne.privateString);
		
		System.out.println(" ClassThree can only access Public variables from ClassOne");

	}
}
