package com.javang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlyingCookies {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.avactis.com/4.7.9/");

		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/ul/li[1]/span/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Input Emial id and Password If you are already Register
		driver.findElement(By.xpath(".//*[@id='account_sign_in_form_email_id']")).sendKeys("madhu.velpuri@gmail.com");
		driver.findElement(By.xpath(".//*[@id='account_sign_in_form_passwd_id']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();

		// create file named Cookies to store Login Information
		File file = new File("Cookies.data");
		try {
			// Delete old file if exists
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			// loop for getting the cookie information
			for (Cookie ck : driver.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.flush();
			Bwrite.close();
			fileWrite.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}