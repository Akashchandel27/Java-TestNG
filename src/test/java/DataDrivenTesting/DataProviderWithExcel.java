package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderWithExcel {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		// Webdriver is interface----- Chromedriver is a clas
		WebDriver driver = new ChromeDriver();

		// Enter the URL
		driver.get("https://www.saucedemo.com/");

		// Manger window, maximize and the browser
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider = "searchDataProvider")
	public void searchkeyword(String keyword) {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	@DataProvider(name="searchDataProvider")
	public Object[][] searchDataProviderMethod(){
		
		Object[][] searchData = new Object[2][1];// 2 rows & 1 col
		searchData[0][0] ="Taj Mahal"; // row 1 col1
		searchData[1][0] ="india gate"; // row 2 col 1
		
		return searchData;
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
