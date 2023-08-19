package chromeoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionUse {

	public static void main(String[] args) 
	{
		//1. create object of ChromeOptions class
		ChromeOptions otp =new ChromeOptions();
		//2. using ChromeOptions object select desired option
		//otp.addArguments("headless");
		//otp.addArguments("incognito");
		//otp.addArguments("start-maximized");
		otp.addArguments("disable-infobars");
		
		//3. pass the object as a parameter in chrome driver
		WebDriver driver =new ChromeDriver(otp);
		driver.get("https://www.google.com/");
		
	WebElement gmailbutton = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		System.out.println(gmailbutton.getText());
		
		}

}
