package setsizeposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetsizeUse {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.manage().window().getSize());
	
        Dimension D = driver.manage().window().getSize();
        
      //1. create an object of Dimension class and pass two parameters
      //1st width and 2nd height
        
        Dimension d1=new Dimension(500,400);
        
      //2.by using setSize method we can set browser size
        
        driver.manage().window().setSize(d1);
	}

}
