package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{    
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement AmountValue = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
             WebElement amountfield = driver.findElement(By.id("amt8"));
             
            JavascriptExecutor js = (JavascriptExecutor)driver;
            
            js.executeScript("arguments[0].scrollIntoView(true)",amountfield);
            
             Thread.sleep(1000);
             
            Actions act=new Actions(driver);
             act.dragAndDrop(AmountValue, amountfield).perform();
             
             Thread.sleep(1000);
             
             //act.clickAndHold(AmountValue).moveToElement(amountfield).release().build().perform();
             
	}

}
