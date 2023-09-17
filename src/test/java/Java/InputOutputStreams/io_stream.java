package Java.InputOutputStreams;

import java.io.IOException;

public class io_stream {

	public static void main(String[] args) throws IOException {
		int i = System.in.read();
		System.out.println(i);  
		System.err.println("error message");  
	}
}
