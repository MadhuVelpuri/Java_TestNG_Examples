package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FinputStream {
	public static void main(String a[]) throws IOException {
		String fname = System.getProperty("user.dir") + "\\MyFile.txt";
		File f = new File(System.getProperty("user.dir") + "\\MyFile.txt");

		FileInputStream fin = new FileInputStream(fname);
		FinputStream fff = new FinputStream();
		fff.read_singlechar(fin);
		fff.usingScanner(f);
		fff.read_allchar(f);
		fin.close();
	}

	public void usingScanner(File f) throws FileNotFoundException {
		Scanner sc = new Scanner(f);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());

	}

	public void read_singlechar(FileInputStream fin) throws IOException {
		int i = fin.read();// to read single character
		System.out.println("First character in file is : " + (char) i);

	}

	public void read_allchar(File f) throws IOException {
		int j = 0;
		FileInputStream fin1 = new FileInputStream(f);
		System.out.print("Total text in file is : ");
		while ((j = fin1.read()) != -1)

		{
			System.out.print((char) j);
		}
		fin1.close();
	}
}
