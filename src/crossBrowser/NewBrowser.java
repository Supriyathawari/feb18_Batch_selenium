package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewBrowser {
	@Parameters("Browsertest")
  @Test
  public void testclass(String sname) {
      WebDriver driver = null;
	  
	  if(sname.equals("chrome"))
	  {
		   driver=new ChromeDriver();
	  }
	  else if(sname.equals("firefox"))
	  {
		   driver=new FirefoxDriver();
	  }
	  else if(sname.equals("edge"))
	  {
		   driver= new EdgeDriver();
	  }
	  
	  
	  driver.get("https://www.policybazaar.com/");
	  driver.findElement(By.xpath("//a[text()='Sign in']")).click();
  }
}
