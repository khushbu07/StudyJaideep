package Java.Datatypes.NonPrimitive.String;

public class String_Manipulation {

	public static void main(String[] args) {
		
		String stringOne = null;
		String stringTwo = " ABC";
		String stringThree = stringOne+stringTwo;
		
		stringTwo = stringTwo + " DEF";
		System.out.println(stringTwo);
		System.out.println(stringThree);
		
		String stringFour = "XYZ";
		String stringFive = "DEF";		
		System.out.println(stringFour + 2+3);		
		System.out.println(stringFive + 2*3);
		System.out.println(2+3+stringFour);
		System.out.println("MNO" + 2+3 + stringFour);
		System.out.println(2*3 + stringFive);
		System.out.println("MNO" + 2*3 + stringFive);

	}

}
