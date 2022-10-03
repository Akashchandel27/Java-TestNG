package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_20_iframe2 {

	public static void main(String[] args) {
		

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//switch to first frame
		//--driver.switchTo().frame(0);
		driver.switchTo().frame("packageListFrame");
		
		//find web elements
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		//switch to main page
				driver.switchTo().defaultContent();//main page
				
				//swith to 2nd frame
				driver.switchTo().frame(1);
				//find web element "Alert" Link text of 2nd frame
				driver.findElement(By.linkText("Alert")).click();
				
				//switch to main page
				driver.switchTo().defaultContent();//main page
				
				//find & print total iframes on web page
				int noOfiframes = driver.findElements(By.tagName("iframe")).size();
				System.out.println("no. of iframes:" + noOfiframes);
		

	}

}
