package testNGassert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void f() 
  {
	  Reporter.log("hiii all", true);
	  Assert.fail();
  }
}
