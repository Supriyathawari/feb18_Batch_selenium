package testNGannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountNo {
	
	
  @Test(invocationCount= 5)
  public void Busbooking() {
	  
	 Reporter.log("busbooking is running", true);
  }
}
