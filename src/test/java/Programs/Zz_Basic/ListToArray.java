package Programs.Zz_Basic;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {

		// A list of size 4 to be converted:
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// Declaring an array of size 4:
		Integer[] arr = new Integer[4];

		// Passing the declared array as the parameter:
		list.toArray(arr);

		// Printing all elements of the array:
		System.out.println("Printing 'arr':");
		for(Integer i: arr)
			System.out.println(i);

		// Declaring another array of insufficient size:
		Integer[] arr2 = new Integer[3];

		// Passing the array as the parameter:
		Integer[] arr3 = list.toArray(arr2);

		// Printing the passed array:
		System.out.println("\n'arr2' isn't filled because it is small in size:");
		for(Integer i: arr2)
			System.out.println(i);

		// Printing the newly allocated array:
		System.out.println("\n'arr3' references the newly allocated array:");
		for(Integer i: arr3)
			System.out.println(i);
	}


}
