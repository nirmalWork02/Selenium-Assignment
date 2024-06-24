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

public class Assignment28 {

	/*
	 * Module 7 - Assignment 3 - JavaRobot
	 */

	public static void main(String[] args) throws Exception {

		// Step 1: Launch https://launchpad.net/sikuli in Firefox browser

		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		Robot r = new Robot();

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://launchpad.net/sikuli");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 2: Click on sikulixsetup-1.1.2.jar to download
		r.mouseWheel(5);
		WebElement link = driver.findElement(By.xpath("//a[normalize-space()='sikulixide-2.0.5.jar']"));

		wait.until(ExpectedConditions.elementToBeClickable(link));
		link.click();
		// Step 3: Go to Window Alert and select Save
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Executed");
		// Step 4: Specify Wait
		// Step 5: Close Site
		Thread.sleep(3000);
		driver.quit();
	}

}
