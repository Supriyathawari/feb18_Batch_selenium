package neostox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAccountBal {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.neostox.com/sign-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//click on sign in button
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//entering mobile no
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("8329290795");
		
		//click on sign in button
		driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("6491");
		
		//click on submit button
		
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		//lunching home page popup
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='×'])[19]")).click();
		
		// click on trial page popup
		Thread.sleep(1000);
		WebElement trialpagepop = driver.findElement(By.xpath("(//span[text()='×'])[36]"));
		     trialpagepop.click();
		
	// refresh page
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
		

	}

}
