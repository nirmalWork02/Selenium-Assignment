package sel.assignment.mod2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment25 {

	/*
	 * Module 6 - Assignment 4 - Actions
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

		//Step 3: Drag the slider up to 50% and drop the slider

		WebElement scroll =driver.findElement(By.xpath("//div[@class='scroll']"));
		a.click(scroll).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		
		// close the browser
		Thread.sleep(3000);
		driver.quit();
	}

}
