package sel.assignment.mod2;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Assignment36 {
	
	/*
	 * Write a Test Script to Automate www.saucedemo.com Login in TestNG - Passparameters from .xls file.
	 */
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
	}
	
	@Test
	public void login() throws Exception{
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\Aravind Raj\\Documents\\TestData.xls"));
		Sheet sh =wb.getSheet("Sheet2");
		int rows =sh.getRows();
		System.out.println("No of "+rows);
		
		for(int i=0;i<rows;i++) {
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(sh.getCell(0,i).getContents());
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(sh.getCell(1,i).getContents());
		}
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		
		
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.quit();
	}

}
