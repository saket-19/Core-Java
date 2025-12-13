package rays.io;
import java.io.*;

public class FileRead {
	public static void main(String[]args) throws Exception {
		FileReader file=new FileReader("C:\\io\\hello.txt");
		int i=file.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=file.read();
		}
		file.close();
		
	}

}
