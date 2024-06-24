package sel.assignment.mod2;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment4 {

	public static void main(String[] args) {
		/*
		 * Convert the following Test Cases into Test Scripts:
		 *  1. TC-1 launch Internet Explorer browser
		 *  2. TC-2 go to test URL https://www.google.com 
		 *  3. TC-3 specify wait time for 5 sec 
		 *  4. TC-4 get the title of page into console
		 *  5. TC-5 close the browser
		 */
			WebDriver driver= new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println(driver.getTitle());
			driver.quit();
	}
}
