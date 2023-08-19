package popUp;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopupEg2 {

	public static void main(String[] args) throws InterruptedException 
	{   
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		Alert a = driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		a.accept();
		

	}

}
