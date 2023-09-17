package Java.ReaderWriter.Writer;

import java.io.IOException;
import java.io.StringWriter;

public class w_StringWriter {

	public static void main(String[] args) throws IOException {

		String data = "This is the text in the string.";

		// Create a StringWriter with default string buffer capacity
		StringWriter sw = new StringWriter();

		// Writes data to the string buffer
		sw.write(data);

		// Prints the string writer
		System.out.println("Data in the StringWriter: " + sw);

		sw.close();

	}
}
