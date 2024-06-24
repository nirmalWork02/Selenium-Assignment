package sel.assignment.mod2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment23 {

	/*
	 * Module 6 - Assignment 2 - Actions
	 */

	public static void main(String[] args) throws Exception {

		// Launch Chrome browser

		WebDriver driver;

		driver = new ChromeDriver();

		Actions a = new Actions(driver);

		// Step 2: Open test URL:
		// http://only-testing-blog.blogspot.com/2014/09/selectable.html

		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
		WebElement dbl =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		a.moveToElement(dbl).doubleClick().build().perform();
		Thread.sleep(3000);
		//Step 4: Accept Alert
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();

		// close the browser
		Thread.sleep(3000);
		driver.quit();
	}

}
