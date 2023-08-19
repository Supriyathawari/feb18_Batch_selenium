package setsizeposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		System.out.println(driver.manage().window().getPosition());
		
		//1.Create and object of Point class, and pass x and y values
		
		Point p=new Point(50, 10);
		//2. by using setPosition method we can set browser position
		
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
	}

}
