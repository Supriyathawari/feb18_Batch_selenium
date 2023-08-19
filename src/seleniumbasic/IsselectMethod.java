package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsselectMethod {

	public static void main(String[] args) 
	{
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        driver.manage().window().maximize();
        
        WebElement redioButton = driver.findElement(By.xpath("//input[@value='radio1']"));
        
        System.out.println(redioButton.isSelected());  // verifying radio button is selected or not
        
        if(redioButton.isSelected()) 
        {
        	System.out.println("radio Button is already selected");
        	
        }
        else 
        {
        	System.out.println("Selecting radio button");
        	redioButton.click();
        }
        
        
        
        
	}

}
