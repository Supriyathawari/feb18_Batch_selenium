package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException 
	{     
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		
	    WebElement emailid = driver.findElement(By.id("email"));
		
         WebElement submit = driver.findElement(By.id("enterimg"));
         
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        Thread.sleep(1000);
        
        js.executeScript("arguments[0].value='demoselenium@gmail.com'",emailid);
        
        Thread.sleep(1000);
        
         js.executeScript("arguments[0].click()",submit);
         
         
         
         
         
	}

}
