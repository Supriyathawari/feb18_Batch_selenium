package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException
	{
     WebDriver driver= new ChromeDriver();
     driver.get("https://demoqa.com/browser-windows");
     
     Thread.sleep(1000);
     
     driver.findElement(By.xpath("//button[text()='New Tab']")).click();
     
     Thread.sleep(1000);
     
     driver.quit();
     
	}

}
