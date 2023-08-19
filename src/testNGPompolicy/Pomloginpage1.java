package testNGPompolicy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomloginpage1 
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
	
	public Pomloginpage1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//method
	
	public void clickOnSignInbuttonHomepage() 
	{
		signinbutton.click();
		
	}
	
	public void intermobileno() 
	{
		Mobilenofield.sendKeys("9552439884");
	}
	
	public void clickwithsigninbutton() 
	{
		signinwithpassword.click();
	}
	
	public void Interpassword() 
	{
		passwordfield.sendKeys("Ashu@1234");
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
