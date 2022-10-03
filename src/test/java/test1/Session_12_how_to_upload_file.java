package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_12_how_to_upload_file {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		//use type=file we can use at the time send keys method
		 driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\akash.chandel\\Downloads\\sampleFile.jpeg");
	}

}
