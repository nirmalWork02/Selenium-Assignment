package sel.assignment.mod2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment34Test {

	/*
	 * Write a Test Script to Automate www.saucedemo.com Login in TestNG - Use Hard
	 * Coded Values.
	 */
	WebDriver driver;

	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@Test
	public void login() {
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
