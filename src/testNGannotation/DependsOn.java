package testNGannotation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn {
	
  @Test (dependsOnMethods = "enterpassword")
  public void login() 
  {
	  Reporter.log("loging sense", true);
	  
  }
  @Test
  public void enterpassword() 
  {
	  Assert.fail();
	  Reporter.log("password", true);
	  
  }
}
