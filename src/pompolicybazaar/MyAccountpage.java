package pompolicybazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountpage 

{
	
	//veriable
	@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']") private WebDriver Username;
	
	
	//constructor
	
	public MyAccountpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	
	public void Validateusername()
	{
	  //actaulvalue = Username.
	}
	

}
