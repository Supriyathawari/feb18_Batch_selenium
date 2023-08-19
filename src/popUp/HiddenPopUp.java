package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//here pop up will appear.
		//before taking any action we need to handle popup 1st
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("i phone 14");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
	}

}
