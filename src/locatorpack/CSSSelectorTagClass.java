package locatorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorTagClass {

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//CSS--> using Tag and Class-->tag.class
		
		//driver.findElement(By.cssSelector("a._97w4")).click();
       
		driver.findElement(By.cssSelector("a._97w5")).click();
	}

}
