package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfreamUse {

	public static void main(String[] args) throws InterruptedException 
	{
      
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(3000);
		
		// before performing action on element present in frame
		// we need to switch selenium focus from main page to frame
          driver.switchTo().frame("iframeResult");// here we are switching selenium focus from main page to Iframe

		
		driver.findElement(By.xpath("//button[contains(text(),'Click me ')]")).click();
		
		// to perform action on main page-->switch focus from Iframe to Main page
		
		driver.switchTo().defaultContent();  // switching to main page
		
		//clicking on change theme button, which is present on Main page

		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
	}

}
