package com.practice;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnit2_FW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				System.out.println( "Hello World!" );
				
				// An example of using HtmlUnitDriver
				String msg = "\n My External IP Address Is" + "\n";
				HtmlUnitDriver driver = new HtmlUnitDriver(true);
				driver.get("http://checkip.dyndns.com/");        
				String ipstring = driver.findElement( By.cssSelector("html body") ).getText();    
				System.out.println( "Debug: " + ipstring ); // just a debug statement to print out result
				msg = msg + ipstring.substring( ipstring.indexOf(": ") + 2) + "\n"; 
				
				// then, print the output to the console
				System.out.println( msg );
				
				// then, write the information to a file
				FileWriter outFile = null;
				try {
					outFile = new FileWriter("ip.txt");
				} catch (IOException e) {
					e.printStackTrace();
				}
				PrintWriter out = new PrintWriter(outFile);
				out.write(msg);
				out.close();
				try {
					outFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

	}

}