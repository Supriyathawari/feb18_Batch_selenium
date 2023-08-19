package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePage {

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/online-login-recruiters");
		String expectedTitle="Online login Recruiters - Online login Placement Consultants - Naukri.com";
		String actualTitle=driver.getTitle();
		System.out.println("Expected Title is ="+expectedTitle);
		System.out.println("actual Title is = "+ actualTitle);
		if(expectedTitle.equals(actualTitle)) 
		{
			System.out.println("Expected and Actual Title are matching & TC is Passed ");
		}
		else
		{
			System.out.println("Expected and Actual Title are not matching & TC is Failed");
		}
		
		
		
	}

}
