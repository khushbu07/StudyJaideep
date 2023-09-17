package Java.ReaderWriter.Writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class w_OutputStreamWriter {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
		String pathFileOutputStreamWriter = projectPath + File.separator + "documents" + File.separator + "File_OutputStreamWriter.txt";
		
		OutputStream os = new FileOutputStream(pathFileOutputStreamWriter);  
		OutputStreamWriter osw = new OutputStreamWriter(os);  
		osw.write("This is OutputStream Writer Demo.");  
		osw.close();  
	}
}
