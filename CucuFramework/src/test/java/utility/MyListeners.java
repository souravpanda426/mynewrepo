package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	public  void onTestStart(ITestResult result) {
	 
		System.out.println(result.getName());
		
		
	  }
	
	 public void onTestSuccess(ITestResult result) {
		 
		 System.out.println(result.getName());
		 
		 
		  }
	 
	 
	 public void onTestFailure(ITestResult result) {
		    
		 
		 System.out.println(result.getName());
		 
		  }


}
