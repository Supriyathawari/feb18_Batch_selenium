package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxtest {
  @Test
  public void demo() 
  {
	  WebDriver driver =new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
  }
}
