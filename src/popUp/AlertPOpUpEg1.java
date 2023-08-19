package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPOpUpEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
        
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alt.accept();
	}

}
