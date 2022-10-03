package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session_07_dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		// It will search for the input country here
		WebElement element = driver.findElement(By.id("input-country"));

		// it will search for the drop -down
		Select dropdown = new Select(element);

		// it will select the country iceland
		// dropdown.selectByVisibleText("Iceland");

		// wait
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// to select the value for the value
		// dropdown.selectByValue("98");

		// select by indec it will select from 0
		dropdown.selectByIndex(10);

		// to check mutilple dropdown
		if (dropdown.isMultiple() == true) {
			System.out.println("Drop-down is mutiple");
		} else {
			System.out.println("drop-down is not mutiple");
		}

		List<WebElement> dropdowns = driver.findElements(By.id("input-country"));

		System.out.println("Total link in the web page" + dropdowns.size());

		for (WebElement a1 : dropdowns) {
			System.out.println(a1.getText());

		}

	}

}
