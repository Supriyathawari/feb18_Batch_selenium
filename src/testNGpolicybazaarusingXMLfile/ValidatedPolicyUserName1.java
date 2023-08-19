package testNGpolicybazaarusingXMLfile;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethod.CommonMethodUse;
import pompolicybazaar.MyAccountpage;
import pompolicybazaar.Pomloginpage;

public class ValidatedPolicyUserName1 {
	
	//ChromeOptions otp=new ChromeOptions();
	//otp.addArguments("disable-notifications");
	
	WebDriver driver;
	Pomloginpage2 login;
	MYaccountTest1 myacc;
	
	@BeforeClass
	public void launchpolicybazaar()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		login =new Pomloginpage2(driver);
		myacc =new MYaccountTest1(driver);
	}
	
	@BeforeMethod
	public void loginTOpolicybazaar() throws EncryptedDocumentException, IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.clickOnSignInbuttonHomepage();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.intermobileno(CommonMethodUse.readDataFromExcel(0, 0));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.clickwithsigninbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.Interpassword(CommonMethodUse.readDataFromExcel(0, 1));
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
  public void verifyUserName() throws EncryptedDocumentException, IOException 
  {
	 String expectedUN=CommonMethodUse.readDataFromExcel(0, 2);
	String actualUN = myacc.getActualUserName();
     
	 Assert.assertEquals(actualUN, expectedUN,"tc is failed,expected and actual result are not maching");
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
