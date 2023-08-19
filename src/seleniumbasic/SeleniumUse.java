package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUse {

	public static void main(String[] args) 
	{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        
        // isdisplay() and isenable() 
        WebElement nametype= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        System.out.println("display stauts is ="+nametype.isDisplayed());
        System.out.println("enabled stauts is ="+ nametype.isEnabled());
        
	}

}
