package sel.assignment.mod2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 {
	
	public static void main(String[] args) throws Exception {
		// Module 4 - Assignment 5
		
		//TC-1 launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//TC-2 go to Facebook Registration Page
		driver.findElement(By.linkText("Create new account")).click();
		WebElement fN = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		//TC-3 fill First Name Textbox with input
		fN.sendKeys("Raj");
		Thread.sleep(3000);
		
		//TC-4 clear the input from First Name Textbox
		fN.clear();
		Thread.sleep(3000);
		
		//TC-5 again fill the First Name Textbox with input
		fN.sendKeys("Nirml");
		//TC-6 Get the input from Textbox and display it in Console
		System.out.println(fN.getAttribute("value"));
	
		//TC-6 Close browse
		driver.quit();
	}

}
