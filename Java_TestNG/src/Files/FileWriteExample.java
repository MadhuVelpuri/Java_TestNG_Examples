package Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String a[]) throws IOException {
		FileWriter fw = new FileWriter("AB_fwriter.txt");
		fw.write("Don't think too much about anything, especially about impossible things");
		fw.write("\nDon't think too much about anything, especially about impossible things");
		fw.close();
		System.out.println("File writing is done");

	}

}
