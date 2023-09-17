package Programs.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNonGeneric {


	public static void main(String[] args) {
		Object[] mixedArray = new Object[4];
		mixedArray[0]=10;
		mixedArray[1]="Jack";
		mixedArray[2]=true;
		mixedArray[3]=System.currentTimeMillis();
		
		System.out.println(Arrays.toString(mixedArray));
		System.out.println(mixedArray[3]);


		System.out.println("======================");
		ArrayList arrList = new ArrayList();
		arrList.add("North");
		arrList.add("East");
		arrList.add("West");
		arrList.add("South");
		arrList.add(1);
		System.out.println("ArrayList Elements");
		System.out.println(arrList);
	}
}


