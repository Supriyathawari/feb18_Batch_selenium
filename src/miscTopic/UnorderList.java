package miscTopic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList {

	public static void main(String[] args) throws InterruptedException 
	{   
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("waches");
		
		Thread.sleep(100);
		 List<WebElement> results = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		 
		 for(WebElement sr:results) 
		 {
			 System.out.println(sr.getText());
		 }
		 
		 for(WebElement sr:results)
		 {
			 String expectedresult ="watches for women";
			 
			 Thread.sleep(100);
		if(expectedresult.equals(sr.getText()));
		{
			sr.click();
			break;
		}
		}
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		 driver.findElement(By.linkText("Images")).click();
		 
	}

}
