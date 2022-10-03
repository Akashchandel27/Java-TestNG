package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_06_radio_buttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();

		List<WebElement> radioelement = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println("Total link in the web page" + radioelement.size());

		for (WebElement a1 : radioelement) {
			System.out.println(a1.getText());

		}
		driver.close();

	}

}
