package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class SampleTest2 {
  @Test
  public void tc5() 
  {
	  Reporter.log("tc5 is running", true);
  }
  
  @Test
  public void tc6() 
  {
	  Assert.fail();
	  Reporter.log("tc6 is running", true);
  }
  @Test(dependsOnMethods = "tc6")
  public void tc7() 
  {
	  Reporter.log("tc7 is running", true);
  }
  @Test
  public void tc8() 
  {
	  Reporter.log("tc8 is running", true);
  }
}
