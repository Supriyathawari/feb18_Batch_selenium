package sceenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotEg1 {

	public static void main(String[] args) throws IOException 
	{
		//double a=10;
		
		//int b=(int) a;
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
		   //System.out.println(source);
		   
		   File dest = new File("C:\\ScreenShortFile\\myscreenshot.png");
		   
		   org.openqa.selenium.io.FileHandler.copy(source, dest);
		
    
	}

}
