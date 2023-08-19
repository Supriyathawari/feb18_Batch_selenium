package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args)
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      
      driver.manage().window().maximize();
      
      WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
      
    System.out.println(textbox.isDisplayed());
    
    WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		
    WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
    
    if(textbox.isDisplayed()) 
    {
    	System.out.println("text box is displayed");
    	textbox.sendKeys("hii");
    }
    else
    {
    	System.out.println("text box is not displayed");
    }
			
	}

}
