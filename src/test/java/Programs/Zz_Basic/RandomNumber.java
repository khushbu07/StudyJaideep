package Programs.Zz_Basic;

import java.util.Random;

//Formula: Math.random() * (max - min + 1) + min  

public class RandomNumber {

	public static void main(String[] args) {
		
		//Example 1: Math.random() Method
		int min = 200;
		int max = 500;
		int intRandom = (int) (Math.random()*(max-min+1)+min);
		double doubleRandom = Math.random()*(max-min+1)+min;
		System.out.println("Int Random "+intRandom);
		System.out.println("Double Random "+doubleRandom);
		
		//Example 2: Using Random Class
		Random random = new Random();
		
		int x = random.nextInt(50);						// Generates random integers 0 to 49
		System.out.println(x);
		
		int y = random.nextInt(1000);					// Generates random integers 0 to 999
		System.out.println(y);
		
		double a = random.nextDouble(); 				// Generates Random doubles values
		System.out.println(a);
		
		float f=random.nextFloat(); 					// Generates Random float values
		System.out.println(f);
		
		long p = random.nextLong();						// Generates Random Long values
		System.out.println(p);
		
		boolean m=random.nextBoolean(); 				// Generates Random boolean values
		System.out.println(m);	
		
	}

}
