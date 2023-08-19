package webtablerading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WholTableRead {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 int rowcount = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
	 int columucount = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th")).size();
		
		for(int i=1; i<=rowcount-1; i++) 
		{
			for(int j=1; j<=columucount; j++) 
			{
				if(i==1) 
				{
					WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//th["+j+"]"));
					System.out.print(data.getText()+" ");
				}
				else 
				{
					WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
					
					System.out.print(data.getText()+" ");
				}
			}
			System.out.println();
		}
		

	}

}
