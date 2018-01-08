package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream {
	public static void main(String a[]) throws IOException {
		// String fname = System.getProperty("user.dir") + "\\MyFile.txt";
		File f = new File("AB.txt");
		FileOutputStream fout = new FileOutputStream(f);
		String content = "All the best waste fellow";
		byte[] content_bytes = content.getBytes();
		fout.write(content_bytes);
	}

}
