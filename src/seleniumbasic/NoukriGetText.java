package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoukriGetText {

	public static void main(String[] args) 
	{
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.naukri.com/");
      
    //expected text--> from requirement document
       String ExpText="Find your dream job now";
       
     //I want actual text
    // to get actual text from webPage--> use getText() method
    // use if else--> to compare text and print result
       
       driver.manage().window().maximize();
       
       String actualText = driver.findElement(By.xpath("//h1[@class='qsb-title']")).getText();
       
       if(ExpText.equals(actualText)) 
       {
    	 System.out.println("Actual and Expected text are Matching and TC is Passed");  
       }
       else 
       {
    	   System.out.println("Actual and Expected text are not Matching and TC is Failed");
       }
       
       
       
       
		
		
	}

}
