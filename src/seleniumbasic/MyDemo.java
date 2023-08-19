package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyDemo {

	public static void main(String[] args) 
	{
       WebDriver driver=new EdgeDriver();
       driver.get("https://www.naukri.com/mnjuser/homepage");
       System.out.println("title of the webpage is :"+driver.getTitle());
       System.out.println("current URL of the webpage is :"+driver.getCurrentUrl());
       System.out.println("pagesource of the webpage is :"+driver.getPageSource());
       

	}

}
