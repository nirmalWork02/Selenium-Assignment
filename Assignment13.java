package sel.assignment.mod2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment13 {

	/*
	 * Automate dropdowns part of Oracle Registration Page in Firefox Browser
	 * https://profile.oracle.com/myprofile/account/create-account.jspx
	 */
	public static void main(String[] args) throws Exception {
		// Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();

		//Selecting the Country Dropdown
		Select country = new Select(driver.findElement(By.xpath("//select[@name='sView1:r1:0:country']")));
		country.selectByVisibleText("Canada");

		//Selecting the State Dropdown
		Select state = new Select(driver.findElement(By.xpath("//select[@name='sView1:r1:0:state']")));
		state.selectByIndex(2);
		
		// Close the window
		Thread.sleep(1000);
		driver.quit();
	}

}
