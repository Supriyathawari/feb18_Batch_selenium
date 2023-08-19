package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoViewUsingActionsClass {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement AmountValue = driver.findElement(By.xpath("//a[text()='5000']"));
		
        WebElement amountfield = driver.findElement(By.id("amt8"));
        
        Actions act=new Actions(driver);
        
        Thread.sleep(1000);
        
        act.scrollToElement(amountfield).perform();
        
		

	}

}
