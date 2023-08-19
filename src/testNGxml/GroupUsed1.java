package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupUsed1 {
  @Test(groups = "sanity")
  public void mymethod1() 
  {
	  Reporter.log("method 1", true);
  }
  @Test(groups = "smock")
  public void mymethod2() 
  {
	  Reporter.log("method 2", true);
  }
  @Test(groups = "sanity")
  public void mymethod3() 
  {
	  Reporter.log("method 3", true);
  }
  @Test
  public void mymethod4() 
  {
	  Reporter.log("method 4", true);
  }
  @Test(groups = "sanity")
  public void mymethod5() 
  {
	  Reporter.log("method 5", true);
  }
  @Test(groups = "smock")
  public void mymethod6() 
  {
	  Reporter.log("method 6", true);
  }
  @Test(groups = "sanity")
  public void mymethod7() 
  {
	  Reporter.log("method 7", true);
  }
}
