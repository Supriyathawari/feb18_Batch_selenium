package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver =new ChromeDriver();
      driver.get("https://demo.guru99.com/test/simple_context_menu.html");
      
    //Steps to take actions using Actions class(Mouse actions)
    //1. create an object of Actions class and pass driver object
	
	Actions a=new Actions(driver);
	//2. by suing actions class object, we can click
	
	WebElement seleniumbutton = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));
	Thread.sleep(1000);
	seleniumbutton.click();
	Thread.sleep(1000);
	a.click(seleniumbutton).perform();
	
	
	
	
	
	}

}
