package Programs.String;

public class MergeStringsAlternatively {

	public static void main(String[] args) {

		String s1 = "ABCDEF";
		String s2 = "XYZ";
		System.out.println(merge(s1, s2));

	}


	public static String merge(String s1, String s2) {
		
		StringBuilder result = new StringBuilder();						// To store the final string

		// For every index in the strings
		for (int i = 0; i < s1.length() || i < s2.length(); i++) {

			// First choose the ith character of the
			// first string if it exists
			if (i < s1.length())
				result.append(s1.charAt(i));

			// Then choose the ith character of the
			// second string if it exists
			if (i < s2.length())
				result.append(s2.charAt(i));
		}

		return result.toString();
	}
}
