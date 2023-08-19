package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUPUse {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ic-close-quickview']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes");
		
		
		
		
		
		
		
}

}
