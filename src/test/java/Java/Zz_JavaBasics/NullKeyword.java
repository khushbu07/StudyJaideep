package Java.Zz_JavaBasics;

import java.util.ArrayList;

public class NullKeyword {

	public static void main(String[] args) {
		
		String a = null;								// We can set Strings or Object (eg: ArrayList) to null
		ArrayList myArrayList = null;					// but we can not set primitive type to null (eg: int a = null; is wrong)
		
		if (a==null) {									// (a==null) is not same as (a.equal(null))
			System.out.println("a is null");			// Because we can not run a method on null value
		}
		
		if (myArrayList==null) {						// (myArrayList==null) is not same as (myArrayList.isEmpty())
			System.out.println("myArrayList is null");  // Because we can not run a method on null value
		}
	}

}
