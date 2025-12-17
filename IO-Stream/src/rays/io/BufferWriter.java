package rays.io;
import java.io.*;

public class BufferWriter {
	public static void main(String[]args) throws Exception {
		BufferedWriter file=new BufferedWriter(new FileWriter("C:\\io\\india.txt"));
		
		file.write("public class hello { ");
		file.newLine();
		
		file.write("public static void main(String[)args) { ");
		file.newLine();
		
		file.write("int a=2;");
		file.newLine();
		
		file.write("int b=3;");
		file.newLine();
		
		file.write("int c=a+b;");
		file.newLine();
		
		System.out.println("Data written successfully");
		file.close();
	}

}
