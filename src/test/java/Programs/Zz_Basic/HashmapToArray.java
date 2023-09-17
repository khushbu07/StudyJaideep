package Programs.Zz_Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashmapToArray {

	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<String, String>();
		 
        hashMap.put("RED", "#FF0000");
        hashMap.put("BLUE", "#0000FF");
 
        Object[] objectArray = hashMap.entrySet().toArray();
 
        System.out.println(Arrays.toString(objectArray));

	}

}
