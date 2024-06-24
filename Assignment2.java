package sel.assignment.mod2;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		/*
		 * Convert the following Test Cases into Test Scripts:
		 *  1. TC-1 launch Chrome browser
		 *  2. TC-2 go to test URL https://www.google.com 
		 *  3. TC-3 specify wait time for 5 sec 
		 *  4. TC-4 get the title of page into console
		 *  5. TC-5 close the browser
		 */
		
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println(driver.getTitle());
			driver.quit();
		}
			
}