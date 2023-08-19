package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLmthod {

	public static void main(String[] args)
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.naukri.com/");
      
      driver.manage().window().maximize();
      
      String currentURL = driver.getCurrentUrl();
      System.out.println("my get current URL ="+ currentURL);
      
      
      System.out.println(driver.getPageSource());
		
	}

}
