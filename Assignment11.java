package sel.assignment.mod2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment11 {
	
	/*Automate dropdowns part of Facebook Registration Page using Direct
	  Locator's in Firefox Browser- https://www.facebook.com/
	 */
	public static void main(String[] args) throws Exception {
		//Invoke Browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Clicking the Signup option
		driver.findElement(By.linkText("Create new account")).click();
		
		//Select the dropdown by using selectByIndex method
		Select day =new Select(driver.findElement(By.id("day")));
		day.selectByIndex(2);
		
		//Select the month dropdown by using SelectByVisible Text method
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jan");
		
		//Select the year dropdown by using selectByvalue method
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1996");
		
		//Clicking the Signup button
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);
		System.out.println("Done");
		
		//Close the window
		driver.close();
	}

}
