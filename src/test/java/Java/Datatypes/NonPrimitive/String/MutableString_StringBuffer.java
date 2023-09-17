package Java.Datatypes.NonPrimitive.String;

/*
 * StringBuffer and StringBuilder classes are used for creating mutable string.
 */

public class MutableString_StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
		
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  
		
		sb.reverse();  
		System.out.println(sb);//prints olleH  
	}

}
