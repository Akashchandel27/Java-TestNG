package test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session_16_screenshots {

	public static void main(String[] args) throws IOException {
		
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uitestpractice.com/");
		driver.manage().window().maximize();
		
		//Capture full page screenshot
		//Step:-1 Convert webdriver object to takes screenshot interface
		//TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//Capture the section page
		WebElement screenshot = driver.findElement(By.xpath("//div[@class='container red']"));
		
		//Step-2 call getscreenshotAs method to create image files
		
		
		// Capture the particular web elements
		//WebElement screenshot = driver.findElement(By.xpath("//button[@name='dblClick']"));
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\akash.chandel\\eclipse-workspace\\codestudio\\Screenshots\\doubleclick.png");
		
		FileUtils.copyFile(src, dest);
		

	}

}
