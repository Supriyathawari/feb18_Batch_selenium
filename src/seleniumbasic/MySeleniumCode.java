package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class MySeleniumCode {

	public static void main(String[] args) 
	{
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.youtube.com/");
    
    //driver.close();
    
  driver.manage().window().maximize();
  driver.manage().window().minimize();
   
  driver.close();
  
  
  //driver.manage().window().maximize();
 // driver.manage().window().minimize();
  
  //driver.close();
    		
	}
}