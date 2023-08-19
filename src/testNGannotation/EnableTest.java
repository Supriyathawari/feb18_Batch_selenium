package testNGannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableTest {
	
  @Test
  public void a() {
	  Reporter.log("method 1 is running", true);
	  
  }
  
  @Test(enabled = false)
  public void b() {
	  Reporter.log("method 2 is running", true);
	  
  }
  @Test
  public void c() {
	  Reporter.log("method 3 is running", true);
	  
  }
  @Test
  public void d() {
	  Reporter.log("method 4 is running", true);
	  
  }
  @Test
  public void e() {
	  Reporter.log("method 5 is running", true);
	  
  }
}
