package locatorpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTagAttributeValue {

	public static void main(String[] args)
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//CSS-->Tag and Attribute-->tag[attribute=value]
		
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("hello");
		
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("hii");

	}

}
