package sel.assignment.mod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment33_TC {

	/*
	 Write a Test Script to Automate www.saucedemo.com Login using Page Object Model.
	 */
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
	}
	
	@Test
	public void VLogin() {
		Assignment33 lo=new Assignment33(driver);
		lo.login();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
