package dropDownSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMonth {

	public static void main(String[] args) throws InterruptedException 
	{
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		//next page will be page--> give some time to load page
		Thread.sleep(1000);
		
		WebElement day1 = driver.findElement(By.id("day"));
		Select sdate=new Select(day1);
		
		sdate.selectByVisibleText("5");
		
		
		WebElement month1 = driver.findElement(By.name("birthday_month"));
		
		Select smonth=new Select(month1);
		
		//selecting month
		smonth.selectByValue("4");
		
		//selecting year
		
		WebElement year1 = driver.findElement(By.id("year"));
		Select syear=new Select(year1);
		
		syear.selectByVisibleText("2003");
		
		// check if any drop down is multiple selectable or not
		//System.out.println("multiple status is ="+ year1.);
		
		

	}

}
