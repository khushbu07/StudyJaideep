package Java.InputOutputStreams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class io_BufferedOutputStream {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathBufferedOutputStream = projectPath + File.separator + "documents" + File.separator + "File_BufferedOutputStream.txt";
		
		// Creates a FileOutputStream
        FileOutputStream fos = new FileOutputStream(pathBufferedOutputStream);

        // Creates a BufferedOutputStream
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String data = "This is BufferedOutputStream demo.";
        byte[] array = data.getBytes();

        // Writes data to the output stream
        bos.write(array);
        bos.close();
		
	}
}
