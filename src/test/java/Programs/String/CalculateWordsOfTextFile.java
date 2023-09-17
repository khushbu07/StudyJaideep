package Programs.String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CalculateWordsOfTextFile {

	public static void main(String[] args) throws Exception {

		String line;  
		int count = 0;  
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathFileInputStream = projectPath + File.separator + "documents" + File.separator + "File_FileInputStream.txt";
		String pathFileReadLines = projectPath + File.separator + "documents" + File.separator + "File_ReadLines.txt";
		String pathBufferedInputStream = projectPath + File.separator + "documents" + File.separator + "File_BufferedInputStream.txt";
		String pathFileBufferedReader = projectPath + File.separator + "documents" + File.separator + "File_BufferedReader.txt";
		
		//Opens a file in read mode  
		FileReader file = new FileReader(pathFileBufferedReader);
		BufferedReader br = new BufferedReader(file);  

		//Gets each line till end of file is reached  
		while((line = br.readLine()) != null) {
			
			//Splits each line into words  
			String words[] = line.split(" ");  
			//Counts each word  
			count = count + words.length;  

		}  

		System.out.println("Total Words: " + count);  
		br.close();

	}

}
