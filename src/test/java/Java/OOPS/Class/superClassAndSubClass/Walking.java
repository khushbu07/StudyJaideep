package Java.OOPS.Class.superClassAndSubClass;

public class Walking extends Shoe{
	
	public final boolean goreTex;
	
	Walking(boolean goreTex, String brand, double size) {

		super(brand, size);										//Need to call this first as first we need to create shoe object
		this.goreTex = goreTex;
	
	}

}
