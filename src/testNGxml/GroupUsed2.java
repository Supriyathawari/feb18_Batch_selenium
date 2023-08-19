package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupUsed2 {
  @Test
  public void mymethod8() 
  {
	  Reporter.log("method 8", true);
  }
  @Test(groups = "sanity")
  public void mymethod9() 
  {
	  Reporter.log("method 9", true);
  }
  @Test(groups = "smock")
  public void mymethod10() 
  {
	  Reporter.log("method 10", true);
  }
  @Test(groups = "sanity")
  public void mymethod11() 
  {
	  Reporter.log("method 11", true);
  }
  @Test(groups = "smock")
  public void mymethod12() 
  {
	  Reporter.log("method 12", true);
  }
  @Test(groups = "sanity")
  public void mymethod13() 
  {
	  Reporter.log("method 13", true);
  }
  @Test
  public void mymethod14() 
  {
	  Reporter.log("method 14", true);
  }
}
