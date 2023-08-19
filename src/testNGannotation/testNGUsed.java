package testNGannotation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGUsed {
  @Test
  public void a() 
  {
	  Reporter.log("a is runing", true);
  }
  @Test(priority = -7)
  public void b() 
  {
	  Reporter.log("b is runing", true);
  }
  @Test(dependsOnMethods ={"a","b"})
  public void c() 
  {
	  //Assert.fail();
	  Reporter.log("c is runing", true);
  }
}
