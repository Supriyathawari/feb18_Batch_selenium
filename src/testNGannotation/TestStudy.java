package testNGannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestStudy {
	
	@BeforeClass
	public void lunchBrowser()
	{
		System.out.println("lunch Browser");
	}
	@BeforeMethod
	public void loginflipkart()
	{
		System.out.println("login flipkart");
	}
	
	@Test
	  public void pleasevalidpassword()
	  {
		  System.out.println("please inter vaild password");
	 }
  @Test
  public void validEmailid() 
  {
	   System.out.println("valid Email id"); 
  }
  
  @AfterMethod
  public void logoutaplication()
  {
	  System.out.println("logout aplication");
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("close Browser");
  }
}
