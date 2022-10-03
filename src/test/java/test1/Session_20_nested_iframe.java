package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session_20_nested_iframe {

	public static void main(String[] args) {

		// Launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();

		driver.switchTo().frame("frame1");// parent frame/outer frame
		driver.switchTo().frame("frame3");// child frame/inner frame

		// find webelemnt checkbox
		driver.findElement(By.id("a")).click();

		// switch to parent frame
		driver.switchTo().parentFrame();

		// find webelement input box
		driver.findElement(By.tagName("input")).sendKeys("this is text msg");

		// switch to default content/main page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");

		// find webelement animal dropdown
		WebElement dropDownElement = driver.findElement(By.id("animals"));
		Select dropDown = new Select(dropDownElement);

		dropDown.selectByVisibleText("Avatar");

	}

}
