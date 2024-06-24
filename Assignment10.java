package sel.assignment.mod2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Assignment10 {
	
	/*
	 * Automate Facebook Registration Page using Direct Locator's in Chrome Browser
	 * https://www.facebook.com/
	 */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Invoke Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		/*
		driver.findElement(By.name("firstname")).sendKeys("Nirmal");
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		driver.findElement(By.name("reg_email__")).sendKeys("name@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("name@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password");
		
		Select day =new Select(driver.findElement(By.id("day")));
		day.selectByValue("2");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1995");
		
		WebElement sex= driver.findElement(By.cssSelector("input[value='2']"));
		sex.click();*/
		Thread.sleep(7000);
		WebElement terms = driver.findElement(By.id("terms-link"));
		//terms.click();
		By policy=RelativeLocator.with(By.tagName("a")).near(terms);
		driver.findElement(policy).click();
		

		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);
		System.out.println("Done");
		driver.close();
	}

}
