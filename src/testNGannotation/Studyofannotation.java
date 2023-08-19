package testNGannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Studyofannotation {
	
	
	
	@BeforeMethod
	public void logintopolicybazaar() 
	{
		System.out.println("login to policy bazaar");
	}
	
  @Test
  public void ValidateUserName() 
  {
	  
	  System.out.println("validate user name");
  }
  @Test
  public void validateGender() 
  {
	 System.out.println("validate gender"); 
  }
  
  @AfterMethod
  public void logoutfromaplication()
  {
	  System.out.println("Logout from aplication");
  }
  @BeforeClass
  public void lunchBrowser()
  {
	  System.out.println("lunch browser");
  }
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("close Browser");
  }
  
}
