package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MytestNGClass {
  @Test
  public void f() {
	  
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  Reporter.log("hii all");
	  
	  Reporter.log("hii all---> log", true);
	  
	  
  }
}
