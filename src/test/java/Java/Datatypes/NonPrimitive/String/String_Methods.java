package Java.Datatypes.NonPrimitive.String;

public class String_Methods {
	
	public static void main(String[] args) {
		
		String stringOne = "abEjsdO";
		String stringTwo = "";
		String stringThree = "Javatpointtt";
		String stringFour = "Welcome to my world";
		String stringFive = "   A B C   ";
		int intOne = 40;
		
		System.out.println("charAt: "+stringOne.charAt(3));											//charAt				
		System.out.println("concat: "+stringOne.concat(" ABC"));									//concat
		System.out.println("toLowerCase: "+stringOne.toLowerCase());								//toLowerCase
		System.out.println("toUpperCase: "+stringOne.toUpperCase());								//toUpperCase
		System.out.println("compareTo: " + stringOne.compareTo(stringThree));						//compareTo
		System.out.println("compareToIgnoreCase(): " + stringOne.compareToIgnoreCase(stringThree));	//compareToIgnoreCase
		System.out.println("length: "+stringOne.length());											//length()
		System.out.println("substring(a,b): "+stringOne.substring(2, 6));							//substring
		System.out.println("substring(a): "+stringFour.substring(6));								//substring
		System.out.println("contains: "+stringOne.contains("do you know")); 						//contains
		System.out.println("join: "+String.join("-","welcome","to","selenium"));					//String.join	> welcome-to-selenium
		System.out.println("equals: "+stringOne.equals("AB"));										//equals
		System.out.println("equalsIgnoreCase: "+stringOne.equalsIgnoreCase(stringTwo));				//equalsIgnoreCase
		System.out.println("hashCode(): "+ stringOne.hashCode());									//hashCode
		System.out.println("isEmpty: "+stringTwo.isEmpty());										//isEmpty
		System.out.println("replace: "+stringOne.replace('s', 'j'));								//replace
		System.out.println("replaceAll: "+stringFour.replaceAll(" ", ""));							//replaceAll
		
		System.out.println("-------------------------------");
		//split
		System.out.println("split: ");
		String[] myArray = stringThree.split("t");													//split
		System.out.println(myArray.length);
		for(String str: myArray) {
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		
		System.out.println("indexOf: "+stringFour.indexOf("world"));					//indexOf
		System.out.println("trim: "+stringFive.trim());									//trim
		System.out.println("valueOf: "+String.valueOf(intOne));							//String.valueOf
		
	}
	
}
