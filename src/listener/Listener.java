package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener


{
  @Override
public void onTestSuccess(ITestResult result) 
  {
	 String tcName = result.getName();
	Reporter.log("this"+tcName+" method is compleated successfully", true);
   }
  
  @Override
	public void onTestFailure(ITestResult result) 
  {
	  Reporter.log("this"+result.getName()+" method is failed please try again", true);
		
	}
  
  @Override
	public void onTestStart(ITestResult result) 
    {
		Reporter.log("test "+result.getName()+"execution start", true);
	}
  @Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("this"+result.getName()+" Tc is skipped.. please check dependent method ", true);
	}
	
}
