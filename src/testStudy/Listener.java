package testStudy;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseuse.BaseStudy;
import utilityStudy.Utility;

public class Listener extends BaseStudy implements ITestListener
{
@Override
     public void onTestFailure(ITestResult result)
{
	try {
		Utility.TakeScreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

   @Override
	public void onTestSuccess(ITestResult result) 
   {
	   Reporter.log("tc"+result.getName()+"passed successfully", true);
		
	}
   
   @Override
	public void onTestStart(ITestResult result) 
   {
		Reporter.log("tc excution started for tc"+result.getName(),true);
	}
}
