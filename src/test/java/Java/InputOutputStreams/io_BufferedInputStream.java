package Java.InputOutputStreams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class io_BufferedInputStream {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathBufferedInputStream = projectPath + File.separator + "documents" + File.separator + "File_BufferedInputStream.txt";
		String pathFileReadLines = projectPath + File.separator + "documents" + File.separator + "File_ReadLines.txt";
		
		// Creates a FileInputStream
        FileInputStream fis = new FileInputStream(pathFileReadLines);

        // Creates a BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(fis);

        // Reads first byte from file
        int i;

        while ((i=bis.read())!=-1) {
            System.out.print((char) i);
        }
        bis.close();
		
	}
}
