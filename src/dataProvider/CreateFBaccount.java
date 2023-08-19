package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateFBaccount {
  @Test(dataProvider = "myFBData",dataProviderClass = DataProviderUse.class)
  public void FBdataProvider(String Name, String LastName, String Mobno) throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.manage().window().maximize();
	  
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
     
     driver.findElement(By.name("firstname")).sendKeys(Name);
     Thread.sleep(1000);
     driver.findElement(By.name("lastname")).sendKeys(LastName);
     Thread.sleep(1000);
     driver.findElement(By.name("reg_email__")).sendKeys(Mobno);
	  
	  
	  
  }
}
