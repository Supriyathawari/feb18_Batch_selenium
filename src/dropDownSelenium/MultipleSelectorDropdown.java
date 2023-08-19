package dropDownSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectorDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Select");
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
         
        WebElement country = driver.findElement(By.id("countriesMultiple"));
        Select s=new Select(country);
        
      //if drop down is multiple selectable or not
        
        System.out.println("multiple select is ="+ s.isMultiple());
        
        s.selectByIndex(0);// selecting INDIA
        s.selectByValue("england");//selecting england
        s.selectByVisibleText("China");//selecting China
        
      //how to deselect ??--> for multiple selectabale

        Thread.sleep(1000);
      //s.deselectByVisibleText("China");//deselecting
        
        s.deselectAll();
        
        
	}

}
