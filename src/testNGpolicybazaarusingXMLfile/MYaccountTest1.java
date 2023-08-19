package testNGpolicybazaarusingXMLfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MYaccountTest1 
{ // variable
	
	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebElement username;
	
	@FindBy(xpath = "//div[@title='Logout']") private WebElement logoutbutton;
	
	//constructor
	
	public MYaccountTest1 (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Method
	
	public String getActualUserName()
	{
		String actualUN=username.getText();
		return actualUN;
	}
	
	public void clickonlogoutbutton()
	{
		logoutbutton.click();
	}

}
