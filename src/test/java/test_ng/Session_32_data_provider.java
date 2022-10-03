package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Session_32_data_provider {
	
	
	@DataProvider(name = "SearchDataSet")
	public Object[][] searchdata()
	{
		Object[][] searchKeyword  = new Object[3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="Qutab Minar";
		
		
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="Taj Mahal";

		searchKeyword[2][0]="Hyderabad";
		searchKeyword[2][1]= "char minar";
		
		return searchKeyword;
	}
	
	@Test(dataProvider ="SearchDataSet")
	 public void testcasegoogle(String country,String monument) {
		 

			//Launch the chrome browser
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\akash.chandel\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.sendKeys(country + " " + monument);
			
			driver.findElement(By.name("btnK")).submit();
			
			driver.close();
	 }
	
	
	 

}
