package test1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class Session_18_implict_waits {

	public static void main(String[] args) {
		

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.in");
		driver.manage().window().maximize();
		
		
		//open url
				driver.get("http://www.ebay.in/");
				
				//wait of 10 seconds
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				Stopwatch watch = null;
				
				try {
					watch = Stopwatch.createStarted();
				//find webelement "START SELLING"
				driver.findElement(By.linkText("START SELLING")).click();
				}
				catch(Exception e)
				{
					watch.stop();
					System.out.println(e);
					System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
				}

	}

}
