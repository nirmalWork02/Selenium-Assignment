package sel.assignment.mod2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment29 {

	/*
	 * Module 7 - Assignment 4 - JavaRobot Test Scenario I: File download Step 1:
	 * Launch Firefox browser 
	 * Step 2: Open test URL:https://www.selenium.dev/downloads/ 
	 * Step 3: In table Selenium Client and WebDriver Language Bindings, automate the plain text.
	 * Step 4: Get the plain text Java, Python into Console 
	 * Step 5: Close browser
	 */

	public static void main(String[] args) throws Exception {

		// Step 1
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Step 2
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3
		String text1=	driver.findElement(By.xpath("//p[text()='Java']")).getText();
		String text2=	driver.findElement(By.xpath("//p[text()='Python']")).getText();
		
		//Step 4
		System.out.println(text1);
		System.out.println(text2);
		
		//Step 5
		driver.quit();
	}

}
