package Java.ReaderWriter.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class r_InputStreamReader {

	public static void main(String[] args) {

		try
		{
			String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
			String pathFileInputStreamReader = projectPath + File.separator + "documents" + File.separator + "File_InputStreamReader.txt";
			
			FileInputStream fis = new FileInputStream(pathFileInputStreamReader);		// Initializing FileInputStream
			InputStreamReader isr = new InputStreamReader(fis);							// Initializing InputStreamReader object

			String encoding = isr.getEncoding();										// Use of getEncoding() method to get the character encoding present in the stream
			System.out.println("Encoding used: "+encoding);
			
			int data = isr.read();
			while(data != -1){
			    char theChar = (char) data;
			    System.out.println("Character is: " + theChar);
			    data = isr.read();
			}			
			isr.close();														// Closing InputStreamReader
			fis.close();														// Closing FileInputStream
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("NO Such File Exists");
		}
		catch (IOException ioe) {
			System.out.println("IOException occurred");
		}

	}
}
