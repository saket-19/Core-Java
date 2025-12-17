package rays.io;
import java.io.*;
public class ReadFromKeyboard {
	public static void main(String[]args) throws Exception {
		PrintWriter out=new PrintWriter(new FileWriter("C:\\io\\temp.txt"));
		System.out.println("Start writing your code here");
		InputStreamReader kb= new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(kb);
		String line=rd.readLine();
		while(!line.equals("exit")) {
			out.println(line);
			line=rd.readLine();
			
		}
		rd.close();
		kb.close();
		out.close();
		
	}
	

}
