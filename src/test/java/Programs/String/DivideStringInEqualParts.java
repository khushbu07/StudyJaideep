package Programs.String;

/*
 * DEFINE str = "aaaabbbbcccc"
 * DEFINE len
 * SET n =3, SET temp = 0.
 * DEFINE String[] equalstr.
 */


public class DivideStringInEqualParts {

	public static void main(String[] args) {
		
		String myString = "aaabbbcccddd";
		int strlen = myString.length();
		int n = 4;							//n is the number by which we are dividing the string
		
		if(strlen%n != 0) {
			System.out.println("String can not be divided in equal parts");
		}else {
			int index = 0;
			int chars = strlen/n;
			String[] strArray = new String[n];
			for(int i=0; i<strlen;i=i+chars) {
				String subString = myString.substring(i,i+chars);
				strArray[index] = subString;
				index++;
			}
			System.out.println("Equal parts of string are:");
			for(int j=0; j<strArray.length; j++) {
				System.out.println(strArray[j]);
			}
			
		}
		
	}

}
