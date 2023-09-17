package Java.Datatypes.NonPrimitive.String;

/*
 * String objects are immutable (that is, unmodifiable or unchangeable)
 * 
 * 
 * 
 */

public class String_WhyStringsAreImmutable {

	public static void main(String[] args) {

		String s = "Jaideep";  
		s.concat(" Choudhary");				//concat() method appends the string at the end  
		System.out.println(s);				//will print Sachin because strings are immutable objects  
		
		s = s.concat(" Choudhary");			//changing the ref
		System.out.println(s);
	}
}
