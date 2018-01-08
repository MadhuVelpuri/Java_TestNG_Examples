package com.pratice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GrdImpl {
	
WebDriver driver;
String baseUrl,nodeURL;


File f;

FileOutputStream fos;

FileInputStream fis=null;

HSSFWorkbook wb;

HSSFSheet ws;    
boolean flag=false;
public Row row;
public Cell cell;
public int i=0,j=0;


	  public void open(String data) throws Exception
    {
		  baseUrl="http://www.facebook.com/";
			nodeURL="http://localhost:4441/wd/hub";

    /*if(data.startsWith("f"))
    	{
    	DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
 		driver=new RemoteWebDriver(new URL(nodeURL),cap);
		driver.get(baseUrl);
		result();
		Thread.sleep(10000);
    	}*/
    	 
    	 if(data.startsWith("c"))
    	{
    		DesiredCapabilities cap1 = DesiredCapabilities.chrome();
	         System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
	         cap1.setBrowserName("chrome");
	        // cap1.setVersion("Node1");
	         driver=new RemoteWebDriver(new URL(nodeURL),cap1);
	 		driver.get(baseUrl);
	 		System.out.println("Chrome is opened and to the given URL is navigated");
	 		result();
	 		Thread.sleep(10000);
        }
    	 
    	/*else if(data.startsWith("i"))
    	{

    	    DesiredCapabilities cap2 = DesiredCapabilities.internetExplorer();

	         System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer.exe");
	         cap2.setBrowserName("ie");
	         driver=new RemoteWebDriver(new URL(nodeURL),cap2);
		 		driver.get(baseUrl);
		 		result();
		driver.quit();
   	 
        }*/
    }
    	 
        

public void result() throws InterruptedException, IOException,NoSuchElementException
{
	int rowCount=1;
System.out.println("Excel reading started");
    fis = new FileInputStream("D:\\Dev\\E2E\\Framework_Appium_JunOS\\TestInputs\\Login_frame.xls");

             try {

                                    wb  = new HSSFWorkbook(fis);

                    }              catch (IOException e)

                    {
      e.printStackTrace();

    }

    ws = wb.getSheet("POI Worksheet");
try{
   rowCount=ws.getPhysicalNumberOfRows();
    System.out.println("No of rows are: "+ rowCount);
    
    
    
        Row row= ws.getRow(i);
       Cell cell= row.createCell(j+5); 
        cell.setCellValue("Result");
    //Create a loop over all the rows of excel file to read it


   for (i=1; i < rowCount-1;i++) {

	  
  // Create a loop to print cell values in a row

	   for ( j = 0; j<row.getLastCellNum(); j++)

	   {

  //Print excel data in console
	 driver.findElement(By.id("email")).clear();
     driver.findElement(By.id("email")).sendKeys(ws.getRow(i).getCell(j+4).getStringCellValue());
     cell.setCellValue("PASS");
     
     driver.findElement(By.id("pass")).clear();
     driver.findElement(By.id("pass")).sendKeys(ws.getRow(i+1).getCell(j+4).getStringCellValue());
     cell.setCellValue("PASS");
     driver.findElement(By.id("loginbutton")).click();

       Thread.sleep(5000);

        // flag= driver.findElement(By.id("gb_71")).isEnabled();   

       // cell = row.createCell(j+5);

      // driver.findElement(By.id("")).getText();

      if(!driver.getTitle().equalsIgnoreCase("(2) Facebook"))

                    {
    	  
    	  
    	  String ele= driver.findElement(By.xpath("//li[@class='_4fn6 _3z']/a")).getText();
    	  if(ele.equalsIgnoreCase("Madhu"))
    	  {    cell.setCellValue("PASS");

    	  }  else{
          driver.navigate().to("https://www.facebook.com/");

                     cell.setCellValue("FAIL");
                     Scrshot();
                 
                    }
fos= new FileOutputStream("D:/Dev/E2E/Framework_Appium_JunOS/src/com/java/Login_out.xls");

      wb.write(fos);
   //System.out.print(row.getCell(j).getStringCellValue()+" ");

       break;

}
	   }
	   }

    fos.close();
    System.out.println("Execution is successful");
}
catch(NullPointerException ne)
{
	ne.printStackTrace();
}
catch(NoSuchElementException nee)
{

	nee.printStackTrace();
}

finally
{

	Scrshot();	
}

}


public void Scrshot() throws IOException
{
	
	System.out.println("-----------Taking Screenshot---------");
	 File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrFile, new File("D:\\tmp.jpg"));
	 System.out.println("----Screenshot taken-------");

}

	public static void main(String[] args) {
		
		GrdImpl g=new GrdImpl();
		//takingscrshot tobj1= new takingscrshot();
		try {
			g.open("firefox");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			g.open("chrome");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

}
