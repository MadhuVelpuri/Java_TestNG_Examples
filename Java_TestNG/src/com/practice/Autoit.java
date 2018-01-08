package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.scriptr.io/login");
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sravanivaluelabs@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("India@1234");
			driver.findElement(By.xpath("//button[@id='sign-in']")).click();
			Thread.sleep(8000);

			driver.findElement(By.xpath("//span[@id='user']")).click();
			driver.findElement(By.xpath("//section/section/aside/section/header/div[2]/ul/li[2]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[13]/div/div/div[2]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//div/div/div/div[1]/div[5]/ul/li[2]/div[2]/div[1]/a")).click();
			driver.findElement(By.xpath("//div[2]/div/div/div/div[1]/div[5]/ul/li[2]/div[2]/div[2]/div[1]/span/label"))
					.click();
			Runtime.getRuntime().exec("D:\\Madhu\\Autoit_Trng\\fileupld.exe");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}