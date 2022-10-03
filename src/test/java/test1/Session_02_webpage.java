package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_02_webpage {

	public static void main(String[] args) {

		// Launching the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		// Webdriver is interface----- Chromedriver is a clas
		WebDriver driver = new ChromeDriver();

		// Enter the URL
		driver.get("https://www.saucedemo.com/");

		// Manger window, maximize and the browser
		driver.manage().window().maximize();
		
		// capture the title of the web page and print
		String title = driver.getTitle();
		System.out.println("Page title :-" + title );
		
		// capture url of the webpage
		System.out.println("url" +driver.getCurrentUrl());
		
		//capture page source
		System.out.println("page source" + driver.getPageSource());
		
		

	}

}
