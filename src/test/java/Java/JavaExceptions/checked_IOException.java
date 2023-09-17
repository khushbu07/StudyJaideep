package Java.JavaExceptions;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * IOException is thrown when there is an issue while reading a file / writing into a file.
 * 
 * Types:
 * 1) FileNotFoundException
 * 2) InterruptedIOException
 * 3) SocketException
 * 4) UnsupportedDataTypeException
 * 
 */

public class checked_IOException {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("myfile.txt");
			System.out.println("Check if the file is there... ");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}	
	}
}
