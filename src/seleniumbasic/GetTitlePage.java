package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlePage {

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.naukri.com/");
       
       driver.manage().window().maximize();
            String mytitle = driver.getTitle();
            System.out.println("my get title page="+mytitle);
		
		
	}

}
