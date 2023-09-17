package Java.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_ScannerFile {

	public static void main(String[] args) {


		try {
			String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
			String pathFileInputStream = projectPath + File.separator + "documents" + File.separator + "File_FileInputStream.txt";
			String pathFileReadLines = projectPath + File.separator + "documents" + File.separator + "File_ReadLines.txt";
			
			File file = new File(pathFileReadLines);

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String word = scanner.next();
				System.out.println(word);
			}
			scanner.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
