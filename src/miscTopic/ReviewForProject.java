package miscTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReviewForProject {

	public static void main(String[] args) 
	{   
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone 14");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement price = driver.findElement(By.xpath("((//div[@class='sg-col-inner'])[6]//span)[14]"));
		
		
		System.out.println(price.getText());

	}

}
