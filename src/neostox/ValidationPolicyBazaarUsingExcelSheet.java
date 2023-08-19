package neostox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethod.CommonMethodUse;

public class ValidationPolicyBazaarUsingExcelSheet {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//using chrome option for disable notification
		
				ChromeOptions otp=new ChromeOptions();
				otp.addArguments("disable-notifications");
				
				
				
				WebDriver driver =new ChromeDriver(otp);
				driver.get("https://www.policybazaar.com/");
				
				driver.manage().window().maximize();
				
				CommonMethodUse.implicitWait(driver,900);
				
				driver.findElement(By.xpath("//a[text()='Sign in']")).click();
				
				Thread.sleep(1000);
				//send the value number field
				String userid = CommonMethodUse.readDataFromExcel(0, 0);
				driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(userid);
				
				//click on sign in button
				
				driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
				
				CommonMethodUse.implicitWait(driver,500);
				
				//send the password in password field
				driver.findElement(By.name("password")).sendKeys(CommonMethodUse.readDataFromExcel(0, 1));
				
				Thread.sleep(500);
				
				driver.findElement(By.xpath("//span[text()='Sign in']")).click();
				
			    CommonMethodUse.implicitWait(driver,500);
			    
			    
			       Thread.sleep(500);
			    driver.findElement(By.xpath("//div[text()='My Account']")).click();
			    
			    Thread.sleep(1000);
				
				driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
				
				
				
				Set<String> allid = driver.getWindowHandles();
				
				List<String> l = new ArrayList<>(allid);
				
				String mainpageid = l.get(0);
				String childpageid = l.get(1);
				
				driver.switchTo().window(childpageid);
				
				Thread.sleep(1000);
				
				String expResult = CommonMethodUse.readDataFromExcel(0, 2);
				
				
				String actualResult = driver.findElement(By.xpath("//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")).getText();
				
				if(expResult.equals(actualResult))
				{
					System.out.println("expected result and actual result are pass");
				}
				else 
				{
					System.out.println("expected result and actual result are fail");
				}
				
				
             driver.quit();
	}

}
