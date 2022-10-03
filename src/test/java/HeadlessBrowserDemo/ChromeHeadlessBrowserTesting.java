package HeadlessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessBrowserTesting {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver();

		// open URL
		driver.get("https://www.google.com");
		
		// print title of web page
		System.out.println("Before search: " + driver.getTitle());
		
		//find search box web elements
	     WebElement searchBox = driver.findElement(By.name("q"));
	     
	     //enter search keyword
	     searchBox.sendKeys("India Gate");
	     searchBox.sendKeys(Keys.ENTER);
	     
	     //pause of 3 sec
	     try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	     driver.quit();
	     
		

	}

}
