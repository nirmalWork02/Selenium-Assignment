package sel.assignment.mod2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assignment33 {

	/*
	 Write a Test Script to Automate www.saucedemo.com Login using Page Object Model.
	 */
	WebDriver driver;
	
	By username = By.xpath("//input[contains(@type,'text')]");
	By password = By.xpath("//input[contains(@type,'password')]");
	By submit = By.id("login-button");
	
	public Assignment33(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void login() {
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(submit).click();
		
	}
	

}
