package Java.Datatypes.NonPrimitive.String;

public class String_EqualsComparison {

	public static void main(String[] args) {
		
		String a = "JD";									// a & b are pointing to same value: JD
		String b = "JD";
		String c = new String("JD");						// c & d are pointing to different memory locations containing same values.
		String d = new String("JD");
		
		if(a==b) {											//== can be used to compare 2 strings values
			System.out.println("a==b: Yes");
		}else {
			System.out.println("a==b: No");
		}
		
		if(c==d) {											//== can not be used to compare 2 String objects 
			System.out.println("c==d: Yes");
		}else {
			System.out.println("c==d: No");
		}
		
		if(c.equals(d)) {									//.equal can be used to compare 2 String objects 
			System.out.println("c.equals(d): Yes");
		}else {
			System.out.println("c.equals(d): No");
		}
		
	}

}
