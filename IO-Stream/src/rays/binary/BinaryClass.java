package rays.binary;
import java.io.*;

public class BinaryClass {
	public static void main(String[] args) throws Exception {
		String source="C:\\io\\shinchan.jpg";
		String target="C:\\io\\cartoon.jpg";
		FileInputStream rd=new FileInputStream(source);
		FileOutputStream out=new FileOutputStream(target);
		int i=rd.read();
		while(i!=-1) {
			out.write(i);
			i=rd.read();
		}
		
		rd.close();
		out.close();
		System.out.println("Copied succesfully");
		
	}

}
