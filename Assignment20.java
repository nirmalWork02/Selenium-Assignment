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

public class Assignment20 {

	/*
	 * Module 5 - Assignment 4
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
		
		//Open test URLhttps://www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome browser
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Click on click here to show confirm alert button
		driver.findElement(By.xpath("//button[@onclick='confirmalert()']")).click();
	
		//Get the text displayed on alert into console
		String txt=driver.switchTo().alert().getText();
		System.out.println("Alert Msg--> "+txt);
		
		//Accept the web alert to delete account
		driver.switchTo().alert().accept();
		
		//Get the text displayed on alert into console
		System.out.println("Alert Msg--> "+driver.switchTo().alert().getText());
		
		//Accept the alert
		driver.switchTo().alert().accept();
		
		//close the browser
		driver.quit();
	}

}
