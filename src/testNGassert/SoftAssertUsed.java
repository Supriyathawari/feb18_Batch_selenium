package testNGassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUsed {
  @Test
  public void usernamepage() 
  {
	  String actualUN=null;
	  String expectedUN="abc";
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertNotNull(actualUN,"username is null tc is faild");
	  
	  s.assertEquals(actualUN, expectedUN,"actual and expected value are not maching, tc is failed");
	  
	  s.assertAll();
	  
  }
}
