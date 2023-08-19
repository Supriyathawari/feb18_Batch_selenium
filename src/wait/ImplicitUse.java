package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitUse {

	public static void main(String[] args) 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement signinbutton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signinbutton.click();
		
		

	}

}
