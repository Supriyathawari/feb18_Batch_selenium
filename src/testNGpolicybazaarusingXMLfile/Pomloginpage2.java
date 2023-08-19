package testNGpolicybazaarusingXMLfile;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import commonMethod.CommonMethodUse;

public class Pomloginpage2 
{
	//veriable
	@FindBy(xpath = "//a[text()='Sign in']") private  WebElement signinbutton;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement  Mobilenofield;
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]")private WebElement signinwithpassword;
	@FindBy(name = "password")private WebElement passwordfield;
	@FindBy(xpath = "//span[text()='Sign in']") private WebElement loginwithsigninbutton;
	@FindBy(xpath = "//div[text()='My Account']")  private WebElement   createmyaccount;
	@FindBy(xpath = "//span[text()=' My profile ']") private WebElement  clickonmyprofile;
	
	
	
	//constructor
	
	public Pomloginpage2(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//method
	
	public void clickOnSignInbuttonHomepage() 
	{
		signinbutton.click();
		
	}
	
	public void intermobileno(String MobNo) 
	{
		Mobilenofield.sendKeys(MobNo);
	}
	
	public void clickwithsigninbutton() 
	{
		signinwithpassword.click();
	}
	
	public void Interpassword(String PWD) 
	{
		passwordfield.sendKeys(PWD);
	}
	
	public void loginwithsigninbuttonHomepage()
	{
		loginwithsigninbutton.click();
	}
	
	public void myaccount()
	{
		createmyaccount.click();
	}
	
	public void myprofile()
	{
		clickonmyprofile.click();
	}
	
	

}
