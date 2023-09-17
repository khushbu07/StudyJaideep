package Programs.Zz_Basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		
		String[] array = {"a", "b", "c"};
        Set<String> set = new HashSet<String>(Arrays.asList(array));
        Set<String> set2 = (Set<String>) Arrays.asList(array);

        System.out.println("Set: " + set);

	}

}
