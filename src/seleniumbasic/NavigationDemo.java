package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      //driver.get("https://www.youtube.com/");
      driver.navigate().to("https://www.youtube.com/");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
     
	}

}
