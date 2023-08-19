package neostox;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethod.CommonMethodUse;

public class ValidatedPolicyBazaarUserName {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//using chrome option for disable notification
		
		ChromeOptions otp=new ChromeOptions();
		otp.addArguments("disable-notifications");
		
		
		
		WebDriver driver =new ChromeDriver(otp);
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
