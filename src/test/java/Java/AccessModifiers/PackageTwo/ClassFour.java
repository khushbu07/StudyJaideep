package Java.AccessModifiers.PackageTwo;

import Java.AccessModifiers.PackageOne.ClassOne;

public class ClassFour extends ClassOne{

	public static void main(String[] args) {

		//Import ClassOne
		ClassFour classOne = new ClassFour();				//Creating instance of subclass(ClassFour) of Parent Class(ClassOne)
															//To Access the protected variable

		//Accessing the variable from ClassOne		
//		System.out.println("Default variable from ClassOne: " + classOne.defaultString);
		System.out.println("Public variable from ClassOne: " + classOne.publicString);
		System.out.println("Protected variable from ClassOne: " + classOne.protectedString);
		//System.out.println("Private variable from ClassOne: " + classOne.privateString);
	}
}
