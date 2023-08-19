package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException
	{
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      
      driver.manage().window().maximize();
      
      Thread.sleep(1000);
      
      driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
      
      Thread.sleep(1000);
      
      String gettextpage = driver.findElement(By.xpath("//div[text()='Log in to Facebook']")).getText();
      
		System.out.println("get text method ="+gettextpage);
		
	}

}
