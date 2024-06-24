package sel.assignment.mod2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Assignment35 {
	/*
	 * Write a Test Script to Automate www.saucedemo.com Login in TestNG. 
	 * ● Apply Data Driven Testing Framework ● Use JXL jar file
	 */
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
	}
	
	@Test(dataProvider="testData")
	public void login(String uName, String passw){
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(uName);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(passw);
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@AfterMethod
	public void taeDown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();
	}
	
	@DataProvider(name="testData")
	public Object[][]FeedData() throws Exception{
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\Aravind Raj\\Documents\\TestData.xls"));
		Sheet sh =wb.getSheet("Sheet2");
		int rows =sh.getRows();
		System.out.println("No of "+rows);
		
		Object[][] Sign_Cred=new Object[rows][2];
		for(int i=0;i<rows;i++) {
			Sign_Cred[i][0]=sh.getCell(0, i).getContents();
			Sign_Cred[i][1]=sh.getCell(1, i).getContents();
		}
		
		return Sign_Cred;
		
	}
	

}
