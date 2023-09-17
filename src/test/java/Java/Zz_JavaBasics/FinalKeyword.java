package Java.Zz_JavaBasics;

/*
 * Final can be variable, method, class or parameter.
 * final variable - you cannot change the value of final variable(It will be constant).
 * final method - you cannot override it.
 * final class - you cannot extend it.
 */

final public class FinalKeyword {

	final int MAX = 5;								//final variable

	final public void sayHi() {						//final method
		System.out.println("Hi!");
	}	

	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		System.out.println(f.MAX);
	}

}

//class OtherClassOne extends FinalKeyword{
//
//	public void sayHi() {							//Getting error that method can not be override
//		System.out.println("Hello!");
//	}
//}

//class OtherClassTwo extends FinalKeyword{			//Getting error that final can not be extended
//
//}
