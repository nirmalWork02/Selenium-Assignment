package sel.assignment.mod2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment8 {

	public static void main(String[] args) throws Exception {

		// TC-1 launch Firefox browser
		WebDriver driver = new FirefoxDriver();

		// TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		// TC-3 maximize the browser window
		driver.manage().window().maximize();

		// TC-4 get the title of page
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// TC-5 click on know more link text
		driver.switchTo().frame("login_page");
		driver.findElement(By.partialLinkText("Know")).click();
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());

		// TC-6 switch from 0th window to 1st window
		driver.switchTo().window(list.get(1));
		Thread.sleep(3000);

		// TC-7 after switching get the title of page
		System.out.println(driver.getTitle());

		// TC-8 switch from 1st window to 0th window
		driver.switchTo().window(list.get(0));
		Thread.sleep(3000);

		// TC-9 after switching, get the title of page
		System.out.println(driver.getTitle());

		// TC-10 close 0th window
		driver.close();
		System.out.println("Parent Window Closed");
	}
}
