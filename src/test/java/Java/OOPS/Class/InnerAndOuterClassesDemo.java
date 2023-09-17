package Java.OOPS.Class;

class OutsideClass{
	int j = 3;
	static String myString = "Jaideep";
	
	
	static class InsideClass{
		int s = 18;
	}
}

public class InnerAndOuterClassesDemo {

	public static void main(String[] args) {
		
		OutsideClass oc = new OutsideClass();							//Accessing OutsideClass
		System.out.println(oc.j);
		System.out.println(OutsideClass.myString);
		
//		OutsideClass.InsideClass ic = oc.new InsideClass();				//Accessing InsideClass: If InsideClass is not static
		OutsideClass.InsideClass ic = new OutsideClass.InsideClass();	//Accessing InsideClass: If InsideClass is static
		System.out.println(ic.s);	
	}

}
