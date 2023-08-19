package crossBrowser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonMethod.CommonMethodUse;

public class CrossBrowserTesting {
	@Parameters("browserName")
  @Test
  public void cbtest(String bName) throws InterruptedException 
  {
	  WebDriver driver = null;
	 
	  if(bName.equals("Chorme")) 
	  {
		  ChromeOptions otp=new ChromeOptions();
			otp.addArguments("disable-notifications");
		   driver=new ChromeDriver();
	  }
	  else if(bName.equals("firefox"))
	  {
		  driver= new FirefoxDriver();
	  }
	  else if(bName.equals("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  
	  
	    driver.get("https://www.policybazaar.com/");
		
		driver.manage().window().maximize();
		
		CommonMethodUse.implicitWait(driver,900);
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9552439884");
		CommonMethodUse.implicitWait(driver,5000);
		
	
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashu@1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
	    
	    
	    
	       Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='My Account']")).click();
	    
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		
		Thread.sleep(3000);
		Set<String> allid = driver.getWindowHandles();
		
		
		
		List<String> l = new ArrayList<>(allid);
		
		String mainpageid = l.get(0);
		String childpageid = l.get(1);
		
		driver.switchTo().window(childpageid);
		
		Thread.sleep(5000);
		
		String expResult="Kamini Harde";
		
		String actualResult = driver.findElement(By.xpath("//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")).getText();
		
		Thread.sleep(2000);
		if(expResult.equals(actualResult))
		{
			System.out.println("expected result and actual result are pass");
		}
		else 
		{
			System.out.println("expected result and actual result are fail");
		}
  }
}
