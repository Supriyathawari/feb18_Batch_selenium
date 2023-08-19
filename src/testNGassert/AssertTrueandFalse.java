package testNGassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueandFalse {
  @Test
  public void demo1() 
  {
	  
	 boolean x= true;
	 boolean y= false;
	 
	// Assert.assertTrue(y,"value is false tc is failed");
	 
	 Assert.assertFalse(x,"value is true tc is failed");
	  
	  
	  
	  
  }
}
