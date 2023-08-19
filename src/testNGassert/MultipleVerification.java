package testNGassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test(priority = -1)
  public void usernamepage() 
  {
	  
	  String actualUN =null;
	  String expectedUN="abc";
	  
	  Assert.assertNotNull(actualUN,"value is null tc is failed");
	  
	  Assert.assertEquals(actualUN, expectedUN,"actual and expected value are not maching, tc is failed");
	  
  }  
	  
	 @Test 
	 public void passwordpage() 
	  {
		 String actualpass="123";
		 String expectedpass="123";
		 
		 Assert.assertNotNull(actualpass,"password is null tc is fail");
		 Assert.assertEquals(actualpass, expectedpass,"actual and expected value are not maching, tc is failed");
	  }
	  
	  

}
