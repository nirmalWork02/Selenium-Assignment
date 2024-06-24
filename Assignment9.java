package sel.assignment.mod2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment9 {

	public static void main(String[] args) throws Exception {

		// TC-1 launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// TC-2 go to test URL - https://www.google.com
		driver.get("https://www.google.com");
		Thread.sleep(5000);

		// TC-3 maximize the browser window
		driver.manage().window().maximize();

		// TC-4 get the URL of page
		System.out.println("Current URL is " + driver.getCurrentUrl());

		// TC-5 navigate to test URL - https://www.selenium.dev/
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(5000);

		// TC-6 get the URL of page
		System.out.println("Navigated to Selenium website and Current URL is " + driver.getCurrentUrl());

		// TC-7 navigate back to test URL - https://www.google.com
		driver.navigate().back();
		Thread.sleep(5000);

		// TC-8 get the URL of page
		System.out.println("Navigated back to Google and Current URL is " + driver.getCurrentUrl());

		// TC-8 navigate one step forward to test URL -https://www.selenium.dev/
		driver.navigate().forward();
		Thread.sleep(5000);
		// TC-9 get the URL of page
		System.out.println("Navigated forward to Selenium website and Current URL is " + driver.getCurrentUrl());

		// TC-10 refresh the current page
		driver.navigate().refresh();
		Thread.sleep(5000);

		// TC-11 get the URL of page
		System.out.println("Refreshed the browser and Current URL is " + driver.getCurrentUrl());

		// TC-12 close the browser
		driver.quit();
		System.out.println("All Windows are Closed");
	}
}
