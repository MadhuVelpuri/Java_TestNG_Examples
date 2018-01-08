package com.javang;

import java.io.FileReader;
import java.io.IOException;

public class TextFileReadingExample1 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader(System.getProperty("user.dir") + "\\MyFile.txt");
			int character;

			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}