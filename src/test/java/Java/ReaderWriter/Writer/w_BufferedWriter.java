package Java.ReaderWriter.Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class w_BufferedWriter {
	
	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathFileBufferedWriter = projectPath + File.separator + "documents" + File.separator + "File_BufferedWriter.txt";
		
		FileWriter fw = new FileWriter(pathFileBufferedWriter);  
	    BufferedWriter bw = new BufferedWriter(fw);  
	    bw.write("This is Buffered Writer Demo.");  
	    bw.close();  
		
	}
}
