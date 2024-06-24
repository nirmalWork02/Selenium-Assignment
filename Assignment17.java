package sel.assignment.mod2;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment17 {

	/*
	 * Automate Facebook Registration Page using Relative XPath in 2 different
	 * Browsers https://www.facebook.com/
	 */

	public static void main(String[] args) throws Exception {
		
		// Launch Firefox/Chrome browser
		WebDriver driver = null;
		Scanner browser = new Scanner(System.in);
		System.out.println("Enter the Browser Name - use chrome/firefox ");
		String bName = browser.next();
		if (bName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Enter a valid browser name either firefox or chrome and re run the program");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Relative Xpath used to find elements
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nirmal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("name@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("name@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password");

		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByValue("2");
		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByValue("1995");

		WebElement sex = driver.findElement(By.xpath("//input[@value='2']"));
		sex.click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(1000);
		System.out.println("Done");
		driver.quit();
	}

}
