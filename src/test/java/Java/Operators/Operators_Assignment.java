package Java.Operators;

/*
 * It is used to assign the value on its right to the operand on its left.
 */

public class Operators_Assignment {

	public static void main(String[] args) {
		
		int a=10;  
		int b=20;  
		a+=4;//a=a+4 (a=10+4)  
		b-=4;//b=b-4 (b=20-4)  
		System.out.println(a);  
		System.out.println(b);  
		
		a+=3;//10+3  
		System.out.println(a);  
		a-=4;//13-4  
		System.out.println(a);  
		a*=2;//9*2  
		System.out.println(a);  
		a/=2;//18/2  
		System.out.println(a);  
		
		short c=10;  
		short d=10;  
		//c+=d;								//c=c+d internally so fine  
		c=(short) (c+d);					  
		System.out.println(d);  
		
	}
}
