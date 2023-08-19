package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro {

	public static void main(String[] args) 
	{
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      
    WebElement facebooklogin = driver.findElement(By.xpath("//*[@id=\"email\"]"));
      facebooklogin.sendKeys("supriyathawari@gmail.com");
      
      WebElement facebookpassword= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
      facebookpassword.sendKeys("Supriya@12");
      
      WebElement facebooksignup =driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
      facebooksignup.click();
      
      
     
      
      
	}

}
