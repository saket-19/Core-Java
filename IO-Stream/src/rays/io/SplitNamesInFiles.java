package rays.io;

import java.io.*;

public class SplitNamesInFiles {
	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new FileReader("C:\\io\\Students.txt"));
		String name = rd.readLine();

		while (name != null) {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\io\\" + name + ".txt"));
			bw.write(name);
			bw.close();
			name = rd.readLine();
		}
		rd.close();
	}

}
