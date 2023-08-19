package testNGassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGassertequalandassertnotEquals {
  @Test
  public void demo() 
  {
	  String s1="suppu";
	  String s2="suppu";
	  String s3="supriya";
	  
	  //Assert.assertEquals(s2, s3,"Both are not equals tc is failed");
	  
	  
	  Assert.assertNotEquals(s2, s3,"Both are equals tc is failed");
  }
}
