package Programs.Zz_Basic;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Banana");

		System.out.println("Contents of Set: "+set);
		String[] myArray = new String[set.size()];
		set.toArray(myArray);

		for(int i=0; i<myArray.length; i++){
			System.out.println("Element at the index "+(i+1)+" is: "+myArray[i]);
		}
	}


}
