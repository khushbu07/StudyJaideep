package Java.Zz_JavaBasics;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("resource")
public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathFileToRead = projectPath + File.separator + "documents" + File.separator + "FileToRead.txt";
		
		File fileToRead = new File(pathFileToRead);		
		Scanner scan = new Scanner(fileToRead); 		
		String fileContent = "";
		
		//Reading the File
		while(scan.hasNextLine()){
			fileContent = fileContent.concat(scan.nextLine() + "\n");
			System.out.println(fileContent);
		}
		
		//Writing to new file
		String pathFileToCreate = projectPath + File.separator + "documents" + File.separator + "FileCreated.txt";
		FileWriter writer = new FileWriter(pathFileToCreate);
		writer.write(fileContent);
		writer.close();
	}

}
