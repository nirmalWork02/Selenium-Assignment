package sel.assignment.mod2;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment19 {

	/*
	 * Automate Facebook Login Page using Relative XPath Axis in 2 different
	 * browsers https://www.facebook.com/
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
		Thread.sleep(5000);
		
		//Relative Xpath Axes used to find elements
		driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@id='email']")).sendKeys("testemail@gmail.com");

		driver.findElement(By.xpath("//input[@id='email']//following::input[@id='pass']")).sendKeys("Password@123");

		driver.findElement(By.xpath("//input[@id='pass']/following::button[@name='login']")).click();

		Thread.sleep(3000);
		System.out.println("Done");
		driver.quit();
	}

}
