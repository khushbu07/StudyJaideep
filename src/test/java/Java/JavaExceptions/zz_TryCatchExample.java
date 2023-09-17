package Java.JavaExceptions;

public class zz_TryCatchExample {

	public static void main(String[] args) {
		
		try {
			int[] a = {2};
			System.out.println(a[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!");
		}

	}

}
