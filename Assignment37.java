package sel.assignment.mod2;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment37 {
	
	/*
	 * WRITE A TEST SCRIPT TO AUTOMATE WWW.SAUCEDEMO.COM LOGIN IN TESTNG - PASS
	 * PARAMETERS FROM .PROPERTIES FILE.
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
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("..\\IntellipaatMaven\\Assignment37.properties");
		pro.load(fis);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys(pro.getProperty("uName"));
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(pro.getProperty("passw"));
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@AfterMethod
	public void taeDown() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();
	}

}
