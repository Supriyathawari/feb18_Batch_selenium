package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 WebElement menu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		 Thread.sleep(1000);
		 
		 Actions act=new Actions(driver);
		 
		 
		act.click(menu).perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();		
		

	}

}
