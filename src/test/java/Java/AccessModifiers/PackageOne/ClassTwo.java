package Java.AccessModifiers.PackageOne;

public class ClassTwo {
	
	public static void main(String[] args) {
		
		//Import ClassOne
		ClassOne classOne = new ClassOne();
		
		//Accessing the variable from ClassOne		
		System.out.println("Default variable from ClassOne: " + classOne.defaultString);		//Can Access: Default variables
		System.out.println("Public variable from ClassOne: " + classOne.publicString);			//Can Access: Public variables
		System.out.println("Protected variable from ClassOne: " + classOne.protectedString);	//Can Access: Protected variables
//		System.out.println("Private variable from ClassOne: " + classOne.privateString);		//Can not Access: Private variables
		
		System.out.println("ClassTwo can access: Default, Public & Protected variables");
		System.out.println("ClassTwo can not access: Private variables");
		
	}	
}
