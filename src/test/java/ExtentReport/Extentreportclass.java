package ExtentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportclass {
	
	ExtentSparkReporter htmlRepoter;
	ExtentReports reports;
	ExtentTest test;
	
	
	@BeforeTest
	public void startReport() {
		
		htmlRepoter = new ExtentSparkReporter("ExtentReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlRepoter);
		
		
		// Add enviroment details
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("user", "prachi");
		reports.setSystemInfo("browser", "chrome");
		
	   // configuration to change look and feel
		htmlRepoter.config().setDocumentTitle("Extent Report Demo");
		htmlRepoter.config().setReportName("Test Report");
		htmlRepoter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a'('zzz')' ");
		
		
	}
	  @Test
	  public void LaunchBrowser() {
		   
		   // create test
		   test = reports.createTest("Launch browser and open url");
		   Assert.assertTrue(true); //test pass
		   
		  
	  }
	  
	  @Test
	  public void Verifytitle() {
		   
		   // create test
		   test = reports.createTest("verifytitle");
		   Assert.assertTrue(false); // test failed
		   
		  
	  }
	  
	  @Test
	  public void logo() {
		   
		   // create test
		   test = reports.createTest("verify logo");
		   Assert.assertTrue(true); // test true
		   
		  
	  }
	  
	  @Test
	  public void Verifyemail() {
		   
		   // create test
		   test = reports.createTest("verify email");
		   throw new SkipException("skipping this test cases with Exception");
		   
		  
	  }
	  
	  
	  @Test
	  public void VerifyUserName() {
		   
		   // create test
		   test = reports.createTest("verify user name");
		   Assert.assertTrue(true); // test true
		   
		  
	  }
	  
	  @AfterMethod
	  public void getTestResult(ITestResult result) {
		  
		  if(result.getStatus()==ITestResult.FAILURE) {
			  test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "FAILED ", ExtentColor.RED)); 
		  }
		  else if(result.getStatus()==ITestResult.SUCCESS) {
			  test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "PASSED ", ExtentColor.GREEN)); 
		  }
		  
		  else if(result.getStatus()==ITestResult.SKIP) {
			  test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "SKIPPED ", ExtentColor.YELLOW)); 
		  }
	  }
	  
	  @AfterTest
	  public void teardown() {
		  reports.flush();
		  
	  }
	

}