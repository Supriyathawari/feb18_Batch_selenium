package sceenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg2 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	File myscreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String random = RandomString.make(4);
	
	File dest=new File("C:\\ScreenShortFile\\testscreenshot"+random+".png");
	
	FileHandler.copy(myscreenshot, dest);
	
	     
		
		

	}

}
