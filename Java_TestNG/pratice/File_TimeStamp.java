package com.pratice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
// Java classes - utility

public class File_TimeStamp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	static SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
	static Date curDate = new Date();
	static String strDate = sdf.format(curDate);
	
	
	 FileOutputStream fout = null;
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		File_TimeStamp fst= new File_TimeStamp();
		//fst.timeStampFile();
		fst.timeStampFolder(strDate);
	}
	
	
	public void timeStampFile() throws IOException
	{
		String fileName = "logFile" + strDate+".txt";
		File newFile = new File(fileName);
		
		try {
			fout = new FileOutputStream(newFile);
			String s="Rahul Dravid and Dhoni are my favourite players";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     System.out.println("File created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
	     
	     fout.close();  

	}
	
	
	public void timeStampFolder(String strDate) throws IOException
	{
		String foldername= "Sample_"+strDate;
		File newFile = new File(foldername);
		newFile.mkdir();
		System.out.println("Folder created");
		if(newFile.exists())
		{
			newFile.setWritable(true);
			fout= new FileOutputStream(newFile);
			String s="Rahul Dravid and Dhoni are my favourite players";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     System.out.println("File inside folder is created");
		}	
		

	}

}
