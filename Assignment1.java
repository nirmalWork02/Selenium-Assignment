package sel.assignment.mod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment1 {

	public static void main(String[] args) {
		/* 1. Write a Test Script to open Test URL in Chrome Browser.
		2. Write a Test Script to open Test URL in Firefox Browser.
		3. Write a Test Script to open Test URL in Internet Explorer Browser.*/
		
		//Task1
		WebDriver driver = new ChromeDriver();
		driver.quit();
		//Task2
		WebDriver driver1 = new FirefoxDriver();
		driver1.quit();
		//Task3
		WebDriver driver3 = new InternetExplorerDriver();
		driver3.quit();
		//Task4
		WebDriver driver4 = new EdgeDriver();
		driver4.navigate().to("https://www.google.com/");
		driver4.quit();
		

	}

}
