package test1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Session_18_Fluent_wait {

	public static void main(String[] args) {
		
		// Launch chrome browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("https://www.ebay.in");
				driver.manage().window().maximize();
		
		//open url
		driver.get("http://www.ebay.in/");

		//fluent wait of 10 seconds

	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is custom message.")
				.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
		element.click();

//		Stopwatch watch = null;
//
//		try {
//			watch = Stopwatch.createStarted();
//			//find webelement "START SELLING"
//			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
//			element.click();
//			//driver.findElement(By.linkText("START SELLING")).click();
//		}
//		catch(Exception e)
//		{
//			watch.stop();
//			System.out.println(e);
//			System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");

	}

}
