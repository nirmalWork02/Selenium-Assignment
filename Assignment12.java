package sel.assignment.mod2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment12 {
	
	/*
	 * Automate Oracle Registration Page in Chrome Browser
	 * https://profile.oracle.com/myprofile/account/create-account.jspx 
	 */
	public static void main(String[] args) throws Exception {
		//Invoke Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:email']")).sendKeys("xxx@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:password']")).sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:retypePassword::content']")).sendKeys("Password@123");
		Thread.sleep(1000);
		
		Select country= new Select(driver.findElement(By.xpath("//select[@name='sView1:r1:0:country']")));
		country.selectByVisibleText("Canada");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='sView1:r1:0:firstName']")).sendKeys("Nirmal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:lastName::content']")).sendKeys("Raj");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='sView1:r1:0:jobTitle']")).sendKeys("Software");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='sView1:r1:0:workPhone']")).sendKeys("9898952521");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='sView1:r1:0:companyName']")).sendKeys("Intellipaat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='sView1:r1:0:address1']")).sendKeys("12, First Street");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='sView1:r1:0:city']")).sendKeys("Chennai");
		Thread.sleep(1000);
		Select state = new Select(driver.findElement(By.xpath("//select[@name='sView1:r1:0:state']")));
				state.selectByIndex(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='sView1:r1:0:postalCode']")).sendKeys("600042");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create Account")).click();
		
		//Close the window
		Thread.sleep(1000);
		driver.quit();
	}

}
