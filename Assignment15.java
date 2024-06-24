package sel.assignment.mod2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment15 {
	
	/*
	 * Write a Test Script to get number of links available on Facebook Page https://www.facebook.com/
	 */
	public static void main(String[] args) throws Exception {
		//Invoke Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Get all links using the tagname and stored it on a list 
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		//Print the count
		int val=links.size();
		System.out.println("The Number of links available on Facebook is "+val);
		
		for(WebElement ele:links) {
			
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}

}
