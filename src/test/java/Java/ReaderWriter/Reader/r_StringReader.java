package Java.ReaderWriter.Reader;

import java.io.IOException;
import java.io.StringReader;

public class r_StringReader {

	public static void main(String[] args) throws IOException {

		String strOne = "Hello Java!! \nWelcome to Javatpoint.";
		String strTwo = "Hello Java!! \tWelcome to Javatpoint.";
		String strThree = "Hello Java!! Welcome to Javatpoint.";
		
		StringReader reader = new StringReader(strOne);
		
		int k=0;
		while((k=reader.read()) != -1){  
			System.out.print((char)k);  
		}  
	}  

}
