package testNGPompolicy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompolicybazaar.MyAccountpage;
import pompolicybazaar.Pomloginpage;

public class ValidatedPolicyUserName {
	WebDriver driver;
	Pomloginpage1 login;
	MYaccountTest myacc;
	
	@BeforeClass
	public void launchpolicybazaar()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		login =new Pomloginpage1(driver);
		myacc =new MYaccountTest(driver);
	}
	
	@BeforeMethod
	public void loginTOpolicybazaar()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.clickOnSignInbuttonHomepage();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.intermobileno();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.clickwithsigninbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.Interpassword();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.loginwithsigninbuttonHomepage();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.myaccount();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.myprofile();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Set<String> allwindowid = driver.getWindowHandles();
		List<String>id=new ArrayList<>(allwindowid);
		
		//switching fouce to child page
		driver.switchTo().window(id.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
  @Test
  public void verifyUserName() 
  {
	 String expectedUN="Kamini Harde";
       String actualUN = myacc.getActualUserName();
       
       Assert.assertEquals(actualUN, expectedUN,"TC failed, actual and expected UN not matching");
  }
  
  @AfterMethod
  public void logoutfrompolicybazaar()
  {
	 myacc.clickonlogoutbutton();
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.quit();
  }
}
