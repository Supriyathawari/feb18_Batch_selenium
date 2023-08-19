package miscTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ratingforproducts {

	public static void main(String[] args) 
	{  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone 14");
		
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       
       WebElement rating = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[6]//span)[14]"));
       
       System.out.println("result is ="+rating.getText());
	}

}
