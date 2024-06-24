package sel.assignment.mod2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment26 {

	/*
	 * Module 7 - Assignment 1 - JavaRobot
	 */

	public static void main(String[] args) throws Exception {

		// Launch Chrome browser

		WebDriver driver;

		driver = new ChromeDriver();


		// Step 2: Open test URL: https://smallpdf.com/word-to-pdf

		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Step 3: Click on Choose File Button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//Step 4: Automate Window Alert by uploading file
		
		Robot r = new Robot();
		StringSelection ss = new StringSelection("C:\\Users\\Aravind Raj\\Desktop\\Samplee.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.setAutoDelay(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Executed");
		// close the browser
		Thread.sleep(3000);
		driver.quit();
	}

}
