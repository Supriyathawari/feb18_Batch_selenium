package neostox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethod.CommonMethodUse;

public class CommonMethodEg1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		CommonMethodUse.implicitWait(driver,900);
		
		WebElement casebacksection = driver.findElement(By.xpath("//h1[text()='Unlimited Cashback']"));
		
		CommonMethodUse.scrollIntoview(driver, casebacksection);
		
		CommonMethodUse.CaptureScreenShot(driver, "mypaytemaccount1");
		
		String value = CommonMethodUse.readDataFromExcel(0, 1);
		
		System.out.println(value);
		
		System.out.println(CommonMethodUse.readDataFromExcel(0, 0));

	}

}
