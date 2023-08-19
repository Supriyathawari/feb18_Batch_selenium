package pompolicybazaar;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethod.CommonMethodUse;

public class TestUserName {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
              CommonMethodUse.implicitWait(driver, 1000);
              
              //create object of login page
              
              Pomloginpage l= new Pomloginpage(driver);
              
              l.clickOnSignInbuttonHomepage();
              Thread.sleep(1000);
              l.intermobileno();
              Thread.sleep(100);
              l.clickwithsigninbutton();
              Thread.sleep(500);
              l.Interpassword();
              Thread.sleep(500);
              l.loginwithsigninbuttonHomepage();
              Thread.sleep(1000);
              l.myaccount();
              Thread.sleep(1000);
              l.myprofile();
              
              //new tab will be open
              
              Set<String> AllId = driver.getWindowHandles();
              
              List<String> al=new ArrayList<>(AllId);
              
              //switching foucs on my accound page
              
              driver.switchTo().window(al.get(1));
              
	}

}
