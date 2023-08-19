package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
         WebDriver driver= new ChromeDriver();
         driver.get("https://www.naukri.com/");
         String ExpectedTitle="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
        		 
        String actualTitle= driver.getTitle();
        
        System.out.println("expected value= "+ ExpectedTitle);
        System.out.println("actual value="+ actualTitle);
        
        if(ExpectedTitle.equals(actualTitle)) 
        {
        	System.out.println("Expected and Actual Title are matching & TC is Passed ");
        }
        else 
        {
        	System.out.println("Expected and Actual Title are not matching & TC is fail");
        }
	}

}
