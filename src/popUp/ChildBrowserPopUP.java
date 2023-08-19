package popUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP {

	
     public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		ArrayList<String> al =new ArrayList<>(allwindow);
		
		String mainpageID= al.get(0);
		String childpageID =al.get(1);
		
		driver.switchTo().window(childpageID);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("the7-search")).sendKeys("good morning");
		
		Thread.sleep(1000);
		
		driver.close();
		
		driver.switchTo().window(mainpageID);
		
		String mainpagetext = driver.findElement(By.tagName("b")).getText();

		System.out.println("mainpage ="+ mainpagetext);
	}

}
