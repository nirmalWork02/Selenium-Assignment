package sel.assignment.mod2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment31 {

	/*
	 * Step 1: Launch Chrome browser 
	 * Step 2: Open test URL:https://smallpdf.com/word-to-pdf 
	 * Step 3: Click on Choose File button 
	 * Step 4: Automate Window Alert by uploading file 
	 * Step 5: : Specify Implicit Wait to complete files conversion and Download button gets displayed
	 * Step 6: Click on Download button 
	 * Step 7: Close browser
	 */

	public static void main(String[] args) throws Exception {

		// Step 1
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step 2
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 3
		driver.findElement(By.xpath("//span[contains(text(),'Choose')]")).click();
		StringSelection file=new StringSelection("C:\\Users\\Aravind Raj\\Desktop\\Sample.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);

		// Step 4
		Robot r = new Robot();
		r.setAutoDelay(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		// Step 5
		WebElement download=driver.findElement(By.xpath("//span[contains(text(),'Download')]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Step 6
		download.click();
		//Step 7
		driver.quit();
	}

}
