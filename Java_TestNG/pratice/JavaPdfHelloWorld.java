package com.pratice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
 
public class JavaPdfHelloWorld {

	
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
	
		
		      Document document = new Document();
		      try
		      {		        
		         
		         //HtmlWriter.getInstance(document , System.out);
		         PdfWriter writer=PdfWriter.getInstance(document , new FileOutputStream("text.pdf"));
		         document.addAuthor("Madhu");
		         document.addCreationDate();
		         document.addCreator("HowToDoInJava.com");
		         document.addTitle("Valuelabs");
		         document.addSubject("An example to show how attributes can be added to pdf files.");
		         
		         
		         document.open();
		         document.add(new Paragraph("A Hello World PDF document."));
		  
		         String img = "C:\\Users\\mvelpuri\\Downloads\\20150502-0024.jpeg";
		         Image image2 = Image.getInstance(img);
		         image2.setAbsolutePosition(450f, 700f);
		         //Scale to new height and new width of image
		         image2.scaleAbsolute(100, 100);
		         //Add to document
		         document.add(image2);
		         document.close();
		         writer.close();
		         System.out.println("PDF createed with an Image");
		      } catch (DocumentException e)
		      {
		         e.printStackTrace();
		      } catch (FileNotFoundException e)
		      {
		         e.printStackTrace();
		      }
		  

	}

}
