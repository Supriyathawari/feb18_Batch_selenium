package testNGassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullandNotNull {
  @Test
  public void f() 
  {
	 
	  String s=null;
	  String s1="abc";
	  
	 // Assert.assertNull(s1,"tc is fail value is not null");
	  
	  Assert.assertNotNull(s,"tc is failed value is null");
	  
	  
	  
  }
}
