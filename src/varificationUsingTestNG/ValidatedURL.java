package varificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidatedURL {
  @Test
  public void validatedURLname() 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	    String actualURL= driver.getCurrentUrl();
		String expectedURL="https://www.naukri.com/";
		
		if(actualURL.equals(expectedURL))
		{
			Reporter.log("Actual and expected URL are matching tc is pass", true);
		}
		else
		{
			Reporter.log("Actual and expected URL are matching tc is fail", true);
		}
	  
  }
}
