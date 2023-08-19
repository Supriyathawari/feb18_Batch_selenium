package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoradActions {

	public static void main(String[] args) throws InterruptedException 
	{    
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("Create new account")).click();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		 WebElement days = driver.findElement(By.id("day"));
		 
		 Actions act=new Actions(driver);
		 
		 Thread.sleep(1000);
		 
		 act.click(days).perform();
		 
		 for(int i=1; i<=7; i++) 
		 {
			 act.sendKeys(days,Keys.ARROW_UP).perform();
		 }
		 act.sendKeys(days,Keys.ENTER).perform();
	}

}
