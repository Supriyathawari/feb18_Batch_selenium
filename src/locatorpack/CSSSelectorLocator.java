package locatorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocator {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//CSS-->using Tag and ID-->tag#id
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("hello");
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("s23");
		
		
		
		
		

	}

}
