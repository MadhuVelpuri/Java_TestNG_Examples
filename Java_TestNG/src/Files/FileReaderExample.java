package Files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String a[]) throws IOException {
		FileReader fr = new FileReader(System.getProperty("user.dir") + "\\MyFile.txt");
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}

}
