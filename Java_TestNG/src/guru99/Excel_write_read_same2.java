package guru99;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Excel_write_read_same2 {

	static String file_name = "D:\\Madhu\\WebMD\\WebMD_LatestFramework\\source\\JIRA_Cases.xls";

	static Cell cell;
	HSSFWorkbook wb = new HSSFWorkbook();
	HSSFSheet hsheet;
	Row row;

	static WebDriver driver = null;
	DesiredCapabilities capabilities = new DesiredCapabilities();

	public void readExcel() throws InterruptedException, IOException {

		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setEnableNativeEvents(true);
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
		File pathToBinary = new File("D:\\Madhu\\ff47\\firefox.exe");

		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		driver = new FirefoxDriver(ffBinary, firefoxProfile, capabilities);
		// driver = new FirefoxDriver();

		driver.get("https://jira.webmd.net/login.jsp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='login-form-username']")).sendKeys("mvelpuri");
		driver.findElement(By.xpath("//*[@id='login-form-password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//*[@id='login-form-submit']")).click();
		Thread.sleep(4000);

		FileInputStream fis = new FileInputStream(new File(file_name));
		wb = new HSSFWorkbook(fis);
		hsheet = wb.getSheet("DesktopTestCases");
		Iterator<Row> row_ite = hsheet.iterator();
		int i = 1;
		while (row_ite.hasNext()) {
			row = row_ite.next();
			Iterator<Cell> cell_ite = row.cellIterator();

			while (cell_ite.hasNext()) {
				Cell cell = cell_ite.next();

				driver.get("https://jira.webmd.net/browse/" + cell.getStringCellValue());
				Thread.sleep(5000);
				String relID = driver.findElement(By.xpath("//div[@id='issue-content']//li[2]/a")).getAttribute("rel");
				cell = row.createCell(i);
				cell.setCellValue(relID);

			}
			System.out.println("\n");
			// i++;
		}

		FileOutputStream out = new FileOutputStream(new File(file_name));
		wb.write(out);
		System.out.println("File Updated Successfully");
		out.close();

	}

	public static void main(String a[]) throws IOException, InterruptedException {
		Excel_write_read_same2 esw = new Excel_write_read_same2();
		// esw.writeExcel();
		Thread.sleep(3000);
		esw.readExcel();
		driver.quit();

	}

}
