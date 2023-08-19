package testNGannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityTest {
  @Test(priority= -2)
  public void c()
  {
	  
	 Reporter.log("method c is running", true);
  }
  @Test(priority=-4)
  public void d() {
	  
	 Reporter.log("method d is running", true);
  }
  @Test (priority=-6)
  public void a()
  {
	  
	 Reporter.log("method a is running", true);
  }
  @Test(priority= 1)
  public void b() 
  {
	  
	 Reporter.log("method b is running", true);
  }
}
