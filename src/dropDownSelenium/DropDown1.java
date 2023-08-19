package dropDownSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//clicking on create new account
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		//next page will be page--> give some time to load page
		Thread.sleep(1000);
		//1.Identify list box to be handled and store it in reference variable
        WebElement day1 = driver.findElement(By.id("day"));
      //2.Create an object of Select class which will accept WebElement as argument
           
      
		Select sdate=new Select(day1);
		
		//3.By using one of the select class methods we can select values form list box like
               
		//1. selectByVisibleText 
		
		sdate.selectByVisibleText("5");
		
		//2. selectByIndex
		
		sdate.selectByIndex(9);
		
		//3. selectByValue
		
		sdate.selectByValue("10");

	}
	


}
