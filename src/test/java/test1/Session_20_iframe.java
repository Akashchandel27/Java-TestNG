package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_20_iframe {

	public static void main(String[] args) {
		
		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		
		//switch to iframe moneyiframe
		driver.switchTo().frame("moneyiframe");
	
		
		//find web elements & print value
		String nseindex = driver.findElement(By.id("nseindex")).getText();

		System.out.println(nseindex);

	}

}
