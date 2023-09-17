package Java.Datatypes.NonPrimitive.String;

public class MutableString_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  
		
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
		
		sb.reverse();  
		System.out.println(sb);//prints olleH  

	}

}
