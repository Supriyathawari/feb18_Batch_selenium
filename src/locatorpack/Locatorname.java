package locatorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorname {

	public static void main(String[] args)
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//2. locators-->Name
		
				driver.findElement(By.name("email")).sendKeys("good");
				driver.findElement(By.name("pass")).sendKeys("234");
		
	
	}

}
