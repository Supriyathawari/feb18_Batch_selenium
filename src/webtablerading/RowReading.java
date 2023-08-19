package webtablerading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowReading {

	public static void main(String[] args) 
	{   
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//how to read single header data
		
		WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//td[1]"));
		
                 System.out.println(data.getText());
                 
                 System.out.println("===================================");
                 
               //how to read single header data
                 
                 WebElement headerdata = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th[3]"));
                 
                 System.out.println(headerdata.getText());
                 System.out.println("======================================");
                 
               //how to read all header data
                 
                 for(int i=1; i<=5; i++) 
                 {
                	WebElement headeralldata = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//th["+i+"]"));
                	
                	System.out.print(headeralldata.getText()+" ");
                	
                 }
                 System.out.println();
                 
                 System.out.println("================================================");
                 
                 //how to read single row data from table
                 
                 for(int i=1; i<=5; i++) 
                 {
                	 WebElement data1 = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//td["+i+"]"));
             		
                     System.out.print(data1.getText()+" ");
                 }
                 System.out.println();
                 
                 System.out.println("=========================================");
                 
                 //how to read all rows data from table
                 
                 //we need to vary tr from 1-27 and td from 1-5 
                 //outer for loop ----> for td varying 1-27 
                 
                 for(int i=1; i<=26; i++) 
                 {
                	 //inner for loop to vary coulum td
                	 
                	for(int j=1; j<=5; j++) 
                	{
                	 WebElement newdata = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
                	 
                	 System.out.print(newdata.getText()+" | ");
                	}
                	System.out.println();
                 }
                 
                 
	}

}
