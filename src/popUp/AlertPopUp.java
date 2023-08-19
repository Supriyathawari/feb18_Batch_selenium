package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver =new ChromeDriver();
       driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 //driver.findElement(By.name("alert")).click();
		 driver.findElement(By.name("confirmation")).click();  // here alert will appear
		//handle alert
		//we need to switch selenium focus from main page to alert
		 Alert alt = driver.switchTo().alert();
		 
		//accept()--> to click on OK button
		//dismiss()--> to click on CANCEL button
		//getText()-->to get text on Alert
		 
		 Thread.sleep(2000);
		 
		 alt.accept();
		
		 	
		
		
		
	}

}
