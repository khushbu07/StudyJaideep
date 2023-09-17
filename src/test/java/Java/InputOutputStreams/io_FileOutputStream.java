package Java.InputOutputStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathFileOutputStream = projectPath + File.separator + "documents" + File.separator + "File_FileOutputStream.txt";
		
		FileOutputStream fos = new FileOutputStream(pathFileOutputStream);    
        fos.write(65);    
        fos.close();    
        System.out.println("success...");    
		
	}
}
