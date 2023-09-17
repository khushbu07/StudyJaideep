package Programs.Conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaConversions {

	public static void main(String[] args) throws Exception {
		
		//String to int
		String strInt ="200";
		System.out.println(Integer.parseInt(strInt));		
		//int to String		
		int intString = 200;
		System.out.println(String.valueOf(intString));			//Way 1
		System.out.println(Integer.toString(intString));		//Way 2
		
		//String to long
		String strlong ="20076379823";
		System.out.println(Long.parseLong(strlong));		
		//long to String
		long lngString = 9993939399L;
		System.out.println(String.valueOf(lngString));			//Way 1
		System.out.println(Long.toString(lngString));			//Way 2
		
		//String to float
		String strFloat = "23.6";
		System.out.println(Float.parseFloat(strFloat));		
		//float to String
		float floatString = 12.3F;								//F is the suffix for float
		System.out.println(String.valueOf(floatString));		//Way 1
		System.out.println(Float.toString(floatString));		//Way 2
		
		//String to double
		String strDouble = "33.1";
		System.out.println(Double.parseDouble(strDouble));
		//double to String
		double doubleString = 12.3;
		System.out.println(String.valueOf(doubleString));		//Way 1
		System.out.println(Double.toString(doubleString));		//Way 2
		
		//String to Date
		String strFive = "31/12/2020";
		Date strDate = new SimpleDateFormat("dd/MM/yyyy").parse(strFive);  
		System.out.println(strDate);
		//Date to String
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		System.out.println(dateFormat.format(date));
		
		//String to char
		String strChar = "ABCD";
		System.out.println(strChar.charAt(0));					//Way 1
		char[] arrChars = strChar.toCharArray();				//Way 2
		for(int i=0; i<arrChars.length; i++) {
			System.out.println(arrChars[i]);
		}
		//char to String
		char charString = 'j';
		System.out.println(String.valueOf(charString));			//Way 1
		System.out.println(Character.toString(charString));		//Way 2
		
		//String to Object
		String strObject = "hello";
		Object obj = strObject;
		System.out.println(obj);
		//Object to String
//		System.out.println(Object.toString());					//Way 1
//		System.out.println(String.valueOf(Object));				//Way 2
		
		//String to boolean
		String strBooleanOne = "true";
		String strBooleanTwo = "ok";
		String strBooleanThree = "TRue";
		System.out.println(Boolean.parseBoolean(strBooleanOne));	//Example 1: strBooleanOne = "true";
		System.out.println(Boolean.parseBoolean(strBooleanTwo));	//Example 2: strBooleanTwo = "ok";
		System.out.println(Boolean.parseBoolean(strBooleanThree));	//Example 3: strBooleanThree = "TRue";
		//boolean to String
		boolean booleanStringOne = true;
		boolean booleanStringTwo = false;
		System.out.println(String.valueOf(booleanStringOne));		//true
		System.out.println(String.valueOf(booleanStringTwo));		//false		
		
		//int to long
		int intLong = 300;
		long lng = intLong;
		System.out.println(lng);
		//long to int
		long lngInteger = 500;
		int integer = (int) lngInteger;
		System.out.println(integer);
		
		//int to double
		int intDouble = 45;
		double dbl = intDouble;
		System.out.println(dbl);
		//double to int
		double doubleInteger = 10.6;
		int integerTwo = (int) doubleInteger;
		System.out.println(integerTwo);
		
		//int to char
		int intChar = 65;
		char charOne = (char) intChar;
		System.out.println(charOne);
		//char to int
		char charIntegerOne = 'a';
		int integerThree = charIntegerOne;						//Example 1: charIntegerOne = 'a';
		System.out.println(integerThree);
		char charIntegerTwo = '1';
		int integerFour = charIntegerTwo;						//Example 2: charIntegerTwo = '1';
		System.out.println(integerFour);
		
	}

}
