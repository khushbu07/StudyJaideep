package Java.OOPS.Zz_ObjectOrientedProgramming;

public class PenMain {

	public static void main(String[] args) {
		
		Pens p = new Pens();
		
		System.out.println(p.color);
		System.out.println(p.type);
		System.out.println(p.pointer);
		
		System.out.println(p.clicked);
		p.click();
		System.out.println(p.clicked);
		p.unclick();
		System.out.println(p.clicked);
	}

}
