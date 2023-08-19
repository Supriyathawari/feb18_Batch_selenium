package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUpStudy {

	public static void main(String[] args) throws InterruptedException 
	{   
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		
		Set<String> windowhand = driver.getWindowHandles();
		
		ArrayList<String>  al =new ArrayList<>(windowhand);
		
		String mainpageid = al.get(0);
		String childpageid = al.get(1);
		
		driver.switchTo().window(childpageid);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.close();
		
		driver.switchTo().window(mainpageid);
		
	String mainpagetext = driver.findElement(By.tagName("h2")).getText();
	
	System.out.println("sent it="+ mainpagetext );
		
		

	}

}
