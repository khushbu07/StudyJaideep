package Java.ReaderWriter.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class r_BufferedReader {

	public static void main(String[] args) throws IOException {

		String line;  
		int count = 0;  

		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathFileBufferedReader = projectPath + File.separator + "documents" + File.separator + "File_BufferedReader.txt";

		//Opens a file in read mode  
		FileReader fr = new FileReader(pathFileBufferedReader);
		BufferedReader br = new BufferedReader(fr);  

		//Gets each line till end of file is reached  
		while((line = br.readLine()) != null) { 
			
			//Print Line
			System.out.println("Current Line: " + line);
			
			String words[] = line.split(" ");			//Splits each line into words    
			count = count + words.length;  				//Counts each word
		}  

		System.out.println("Total Words: " + count);  
		br.close();
	}
}
