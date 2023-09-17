package Java.Scanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_ScannerFileInputStream {

	public static void main(String[] args) {

		try {
			
			String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
			String pathFileInputStream = projectPath + File.separator + "documents" + File.separator + "File_FileInputStream.txt";
			String pathBufferedInputStream = projectPath + File.separator + "documents" + File.separator + "File_BufferedInputStream.txt";
			
			File file = new File(pathFileInputStream);
			FileInputStream fis = new FileInputStream(file);
			
			Scanner scanner = new Scanner(fis);
			
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error Reading File");
			e.printStackTrace();
		}

	}
}
