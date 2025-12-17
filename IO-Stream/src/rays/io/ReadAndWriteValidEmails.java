package rays.io;

import java.io.*;

public class ReadAndWriteValidEmails {
	public static void main(String[] args) throws Exception {

		FileReader source = new FileReader("C:\\io\\Email.txt");

		FileWriter target = new FileWriter("C:\\io\\ValidEmail.txt");

		BufferedReader br = new BufferedReader(source);

		BufferedWriter bw = new BufferedWriter(target);

		String email = br.readLine();

		while (email != null) {
			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				br.readLine();
			}
			email = br.readLine();
		}
		
		br.close();
		bw.close();

	}

}
