package Java.OOPS.Class.superClassAndSubClass;

public class MainClass {

	public static void main(String[] args) {
		
		Shoe s = new Shoe("Nike", 11);
		System.out.println("SHOE - Brand: " + s.brand + " | Size: " + s.size);
		
		Walking w = new Walking(false, "Adidas", 8);
		System.out.println("WALKING - GoreTex: " + w.goreTex + " | Brand: " + w.brand + " | Size: " + w.size);
		
		Running r = new Running(50, "NB", 9);
		System.out.println("RUNNING - Weight: " + r.weight + " | Brand: " + r.brand + " | Size: " + r.size);
		
	}

}
