package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class dynamicwebtable {
public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
	     
		driver = new ChromeDriver();
		    driver.get("https://www.openerp.com/en/");
		    driver.findElement(By.linkText("Accounting")).click();
		    Thread.sleep(20000);
		    
		    // Get hold of static object underneath which you have your dynamic content like rows.
		WebElement tablebody= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody"));
		    
		// Use By.tagName() to get all elements of desired tag underneath the above static element
		  
		 List<WebElement> rows  = tablebody.findElements(By.tagName("tr"));

		// Get the size of weblist to get number of rows    

		 System.out.println(rows.size());
		    int rowsnum= rows.size();
		    String xpath =null;
		    String cellval;
		    double total=0;
		    //html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[5]
		    for(int i = 1;i<=rowsnum-2;i++){
		        
		        xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[" + String.valueOf(i) + "]/td[8]" ;
		        cellval = driver.findElement(By.xpath(xpath)).getText() ;
		        
		        System.out.println(cellval);
		        
		        if(cellval!= "" && cellval!= null){
		        
		            System.out.println("String inside" + cellval);
		            total = Double.parseDouble(cellval) + total;
		        }
		        
		        
		    }
		        
		    System.out.println(total);
		}
		    

}
