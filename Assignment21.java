package sel.assignment.mod2;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment21 {

	/*
	 * Module 5 - Assignment 5
	 */

	public static void main(String[] args) throws Exception {

		// Launch Firefox/Chrome browser
		
		WebDriver driver = null;
		try (Scanner browser = new Scanner(System.in)) {
			System.out.println("Enter the Browser Name - use chrome/firefox ");
			String bName = browser.next();
			if (bName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (bName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				System.out.println("Enter a valid browser name either firefox or chrome and re run the program");
			}
		}
		
		
		//Open test URL :https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in Chromebrowser

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//: Switch into Frame
		WebElement fr=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(fr);
		
		//Click on Try it Button
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		//Send the text into Alert
		driver.switchTo().alert().sendKeys("Demo Assignment");
		
		//Accept the Web Alert
		driver.switchTo().alert().accept();
		
		//Get the text displayed on page into Console
		System.out.println("Alert Test--> "+driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		//close the browser
		driver.quit();
	}

}
