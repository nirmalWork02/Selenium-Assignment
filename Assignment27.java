package sel.assignment.mod2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment27 {

	/*
	 * Module 7 - Assignment 2 - JavaRobot
	 */

	public static void main(String[] args) throws Exception {

		// Step 1

		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		Robot r = new Robot();

		driver = new FirefoxDriver();
		// driver =new ChromeDriver();

		// Step 2
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3
		r.mouseWheel(5);
		WebElement link = driver.findElement(By.xpath(
				"//*[contains(@href,'https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.20.0/selenium-java-4.20.0.zip')]"));

		wait.until(ExpectedConditions.elementToBeClickable(link));
		link.click();
		// Step 4
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Executed");
		// Step 5
		Thread.sleep(3000);
		driver.quit();
	}

}
