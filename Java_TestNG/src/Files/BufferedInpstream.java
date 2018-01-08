package Files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInpstream {
	public static void main(String a[])
			throws IOException {/*
								 * String fname = System.getProperty("user.dir")
								 * + "\\MyFile.txt"; FileInputStream fin = new
								 * FileInputStream(fname); BufferedInputStream
								 * bin = new BufferedInputStream(fin); int i =
								 * 0; System.out.println(
								 * "File reading using BufferedInoutStream" +
								 * "\n"); while ((i = bin.read()) != -1) {
								 * System.out.print((char) i);
								 * 
								 * } bin.close(); fin.close();
								 * 
								 */

		String fname = System.getProperty("user.dir") + "\\Myfile.txt";
		FileInputStream fin = new FileInputStream(new File(fname));
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i = 0;
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
