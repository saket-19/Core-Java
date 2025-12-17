package rays.io;
import java.io.*;

public class BufferReader {
	public static void main(String[]args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("C:\\io\\java.txt"));

		String line = file.readLine();

		while (line != null) {
			System.out.println(line);
			line = file.readLine();
		}

		file.close();

			
		}
		
		
	}


