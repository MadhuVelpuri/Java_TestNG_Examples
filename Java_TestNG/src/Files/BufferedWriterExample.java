package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedWriterExample {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("AB_bw.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Sometimes better to avoid such a thing that can ruin ur past, present and future of your life.");
		buffer.newLine();
		buffer.write("This is second line...");
		buffer.close();
		System.out.println("Success");
		read_linebyline();
	}

	public static void read_linebyline() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\sample.txt");
		BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
		String line = bfr.readLine();
		while (line != null) {
			System.out.println(line + "\n\n");
			line = bfr.readLine();
		}

	}
}