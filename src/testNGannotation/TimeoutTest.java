package testNGannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutTest {
  @Test(timeOut = 1000)
  public void login () throws InterruptedException 
  {
	  Thread.sleep(1000);
	  Reporter.log("login working", true);
  }
}
