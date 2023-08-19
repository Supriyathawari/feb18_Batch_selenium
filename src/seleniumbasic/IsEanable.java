package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEanable {

	public static void main(String[] args) throws InterruptedException 
	
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
      
      driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		 boolean Result = getOTP.isEnabled();
		 
		 System.out.println("get otp button="+Result);
		 
		 getOTP.click();
	}

}
