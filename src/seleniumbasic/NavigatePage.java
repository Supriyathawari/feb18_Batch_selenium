package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePage {

	public static void main(String[] args) {
   WebDriver driver =new ChromeDriver();
   driver.get("https://www.naukri.com/");
   
   driver.manage().window().maximize();
   
   driver.navigate().to("https://www.naukri.com/");
   driver.navigate().to("https://paytm.com/login");
   driver.navigate().back();
   driver.navigate().forward();
   driver.navigate().refresh();
   
	}

}
