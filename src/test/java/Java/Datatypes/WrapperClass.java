package Java.Datatypes;

/*
 * Explanation:
 * The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
 * 
 * Need:
 * We have collection framework (list, set, queue etc) in Java which supports only Non-Primitive datatypes like - Integer, Double
 * Hence, required to make use of wrapper classes.
 * 
 Wrapper Classes:
 Primitive					Wrapper Class
 boolean					Boolean
 char						Character
 byte						Byte
 short						Short
 int 						Integer
 long						Long
 float						Float
 double						Double						
 */

public class WrapperClass {

	public static void main(String[] args) {
		
		System.out.println("Converting Primitive to Non-Primitive (Object): Explicitly & Autoboxing");
		int a=10;
		int b=20;
		Integer A = Integer.valueOf(a);	//converting int into Integer explicitly
		System.out.println(A);
		Integer B = b;					//Autoboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println(B);
		
		System.out.println("Converting Non-Primitive (Object) to Primitive: Explicitly & Unboxing");
		Integer c = new Integer(30);
		Integer d = 40;
		int C = c.intValue();			//converting Integer to int explicitly
		System.out.println(C);
		int D = d;						//Unboxing, now compiler will write a.intValue() internally
		System.out.println(D);
		
	}
}
