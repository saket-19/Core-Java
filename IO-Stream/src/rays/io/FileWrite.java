package rays.io;
import java.io.*;

public class FileWrite {
	public static void main(String[] args) throws Exception {
		FileWriter file=new FileWriter("C:\\io\\rays.txt");
		file.write("hello java");
		System.out.println("text data write successfullly");
		file.close();
		
		FileReader file1=new FileReader("C:\\io\\rays.txt");
		int i=file1.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=file1.read();
		}
		file.close();
		
		
		
		
	}

}
