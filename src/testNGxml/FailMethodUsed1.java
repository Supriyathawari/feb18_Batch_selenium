package testNGxml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailMethodUsed1 {
  @Test
  public void mymethod1() 
  {
	  Reporter.log("method 1", true);
  }
  @Test
  public void mymethod2() 
  {
	  Reporter.log("method 2", true);
  }
  @Test
  public void mymethod3() 
  {
	  Reporter.log("method 3", true);
  }
  @Test
  public void mymethod4() 
  {
	  Assert.fail();
	  Reporter.log("method 4", true);
  }
  @Test
  public void mymethod5() 
  {
	  Reporter.log("method 5", true);
  }
  @Test
  public void mymethod6() 
  {
	  Reporter.log("method 6", true);
  }
  @Test
  public void mymethod7() 
  {
	  //Assert.fail();
	  Reporter.log("method 7", true);
  }
}
