package sel.assignment.mod2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment22 {

	/*
	 * Module 6 - Assignment 1 - Actions
	 */

	public static void main(String[] args) throws Exception {

		// Launch Chrome browser

		WebDriver driver;

		driver = new ChromeDriver();
		
		Actions a = new Actions(driver);

		// Open test URL- https://www.flipkart.com/
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3: If found any screen hiding actual page, close the screen

		//Step 4: Move mouse pointer towards Women
		driver.findElement(By.xpath("//img[@alt='Fashion']")).click();
		WebElement women =driver.findElement(By.xpath("//*[contains(text(),'Women Footwear')]"));
		//a[@class='_1BJVlg _11MZbx']
		int x= women.getLocation().getX();
		int y =women.getLocation().getY();
		
		a.moveByOffset(x, y).click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement wom = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
		a.moveToElement(wom).click().build().perform();
		//Step 5: Click on Shoes
		
		WebElement shoes=driver.findElement(By.xpath("//a[@title='Shoes']"));
		
		a.moveToElement(shoes).click().build().perform();
		
		
		// close the browser
		Thread.sleep(3000);
		driver.quit();
	}

}
