package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class logincrossBrowser {
	@Parameters("browserName")
  @Test
  public void loginbutton(String cname) 
  {    
	  WebDriver driver = null;
	  
	  
	  if(cname.equals("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(cname.equals("firefox"))
	  {
		  driver=new FirefoxDriver(); 
	  }
	  else if(cname.equals("edge"))
	  {
		   driver=new EdgeDriver();
	  }
	  
	   driver.get("https://www.policybazaar.com/");
	  
	  driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	  
  }
}
