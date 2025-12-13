package rays.io;
import java.io.File;
import java.util.*;

public class FileInfo {
	public static void main(String[] args) {
		File file=new File("C:\\io\\hello.txt");   //file open
		
		if(file.exists()) {
			System.out.println("file name: "+file.getName());
			System.out.println("file path: "+file.getAbsolutePath());
			
			System.out.println("Access permission");
			System.out.println("file read: "+file.canRead());
			System.out.println("file write: "+file.canWrite());
			
			System.out.println("check if it is folder/directory or a file");
			System.out.println("is file: "+file.isFile());
			System.out.println("is folder: "+file.isDirectory());
			
			System.out.println("last modified");
			Date lastmodified=new Date(file.lastModified());
			System.out.println("last modiefied at : "+lastmodified);
			System.out.println(file.length());
			
		
		}
		
	}
	

}
