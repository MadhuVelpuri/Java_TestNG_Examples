package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Copy {

	public static void main(String a[]) throws IOException {

		/*
		 * FileInputStream fin = new
		 * FileInputStream(File_Copy.createFile("InnoAds", "My Passion."));
		 * FileOutputStream fout = new FileOutputStream(
		 * File_Copy.createFile("InnoAds_Motto",
		 * "Creating Concepts for Ad commercials."));
		 * 
		 * byte[] buffer = new byte[1024];
		 * 
		 * int length; // Copying InnoAds file content to InnoAds_Motto file
		 * while ((length = fin.read(buffer)) != -1) { fout.write(buffer, 0,
		 * length); } System.out.println("Copied successfully...");
		 * 
		 * fin.close(); fout.close();
		 */

		/*
		 * String s1 = "JAVA"; String s2 = new String("JAVA"); boolean y =
		 * s1.equals(s2); System.out.println(s1.equals(s2));
		 */
	}

	public static File createFile(String file_name, String content) throws IOException {
		System.out.println("Creating a file...");
		File fname = new File(System.getProperty("user.dir") + "//" + file_name + ".txt");
		FileOutputStream fout = new FileOutputStream(fname);
		byte[] b = content.getBytes();
		fout.write(b);
		System.out.println("File Created Successfully...");
		fout.close();
		return fname;
	}

}
