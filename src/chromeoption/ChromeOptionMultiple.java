package chromeoption;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionMultiple {

	public static void main(String[] args) 
	{
		
		ChromeOptions otp =new ChromeOptions();
	  ArrayList<String> al=new ArrayList<>();
	  al.add("incognito");
	  al.add("start-maximized");
	  al.add("disable-notifications");
	  
	  otp.addArguments(al);
		
		
		
		WebDriver driver =new ChromeDriver(otp);
		driver.get("https://www.ajio.com/");
		
		

	}

}
