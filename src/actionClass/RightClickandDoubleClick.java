package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickandDoubleClick {

	public static void main(String[] args) 
	{
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//Create and Object of Actions Class and pass driver object as parameter
		Actions ac=new Actions(driver);
		// by using action class object take required actions
		//option1 to context click
		
		ac.contextClick(rightclickbutton).perform();
		
		//option2 to context click
		
		//ac.moveToElement(rightclickbutton).perform();
		//ac.contextClick().perform();
		
		//option3 to context click
		
		//ac.moveToElement(rightclickbutton).contextClick().build().perform();
		
		//double click on button
		
		ac.doubleClick(doubleclickbutton).perform();
		
		//ac.moveToElement(doubleclickbutton).doubleClick().build().perform();
		
	}

}
