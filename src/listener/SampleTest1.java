package listener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listener.Listener.class)
public class SampleTest1 {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 is Rinning", true);
  }
  @Test(timeOut = 500)
  public void TC2() throws InterruptedException 
  {
	  Thread.sleep(1500);
	  Reporter.log("TC2 is Rinning", true);
  }
  @Test(dependsOnMethods = "TC2")
  public void TC3() 
  {
	  Reporter.log("TC3 is Rinning", true);
  }
  @Test
  public void TC4() 
  {
	  Reporter.log("TC4 is Rinning", true);
  }
}
