package test_ng;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Session_34_Listener1 implements ITestListener {
	
	  public void onstart(ITestContext Result) {
		  System.out.println("on start method invoked");
	  }
	  
	  
	  public void onfinish(ITestContext Result) {
		  System.out.println("on finish method invoked");
	  }

	  
	  public void onTestFailure(ITestContext Result) {
		  System.out.println("Name of test case fail "+Result.getName());
	  }
	  
	  public void onTestskipped(ITestContext Result) {
		  System.out.println("Name of test case skipped "+Result.getName());
	  }
	  
	  
	  public void onTeststart(ITestContext Result) {
		  System.out.println("Name of test case started "+Result.getName());
	  }
	  
	  public void onTestsucess(ITestContext Result) {
		  System.out.println("Name of test case sucess "+Result.getName());
	  }
	  
	  public void onTestfailedButwithinSucesspercentage(ITestContext Result) {
		  System.out.println("Name of test case sucess "+Result.getName());
	  }
	  
}
