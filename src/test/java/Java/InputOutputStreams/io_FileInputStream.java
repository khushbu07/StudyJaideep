package Java.InputOutputStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class io_FileInputStream {

	public static void main(String[] args) throws IOException {

		try {

			String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
			String pathFileInputStream = projectPath + File.separator + "documents" + File.separator + "File_FileInputStream.txt";
			String pathFileReadLines = projectPath + File.separator + "documents" + File.separator + "File_ReadLines.txt";
			String pathBufferedInputStream = projectPath + File.separator + "documents" + File.separator + "File_BufferedInputStream.txt";
			String pathFileBufferedReader = projectPath + File.separator + "documents" + File.separator + "File_BufferedReader.txt";
			
			File input = new File(pathFileBufferedReader);
			FileInputStream fis = new FileInputStream(input);
			Scanner scan = new Scanner(fis);
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error Reading File");
			e.printStackTrace();
		}

	}
}
