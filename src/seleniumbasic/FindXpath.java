package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindXpath {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      
      driver.manage().window().maximize();
      
      WebElement login=
      
      driver.findElement(By.xpath("//input[@id='email']"));
      login.sendKeys("supriyathawari@gmail.com");
      
      Thread.sleep(1000);
       
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345@abc");
      
      //driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
      
      driver.findElement(By.xpath("//input[@id='email']")).clear();
      
      driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
      
       
	}

}
