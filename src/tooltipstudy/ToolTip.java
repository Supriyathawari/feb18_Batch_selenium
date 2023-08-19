package tooltipstudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		 WebElement tooltipuse = driver.findElement(By.xpath("//select[@title='Search in']"));
		
          String tooluse = tooltipuse.getAttribute("title");
          
          
          System.out.println(tooluse);
	}

}
