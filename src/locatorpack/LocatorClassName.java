package locatorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassName {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	//locator--> class
	
	driver.findElement(By.className("inputtext")).sendKeys("hello");

	}

}
