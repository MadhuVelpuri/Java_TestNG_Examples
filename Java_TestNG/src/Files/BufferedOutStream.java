package Files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutStream {
	public static void main(String a[]) throws IOException {
		File f = new File("AB_Buffer.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		FileOutputStream fout = new FileOutputStream(f);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String content = "Concentrate on your career... U... useless";

		byte[] content_bytes = content.getBytes();
		bout.write(content_bytes);
		bout.flush();
		bout.close();
		System.out.println("File writing is done.");

	}

}
