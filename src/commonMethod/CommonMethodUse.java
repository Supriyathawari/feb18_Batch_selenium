package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethodUse 
{
	//Wait
	public static void implicitWait(WebDriver driver, long Wait)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(0));
		
	}
	
	//Screenshot
	public static void CaptureScreenShot(WebDriver driver, String fileName) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File dest= new File("C:\\\\ScreenShortFile\\\\myscreenshot"+fileName+".png");
		 
		 FileHandler.copy(src, dest);
		 
	}
	
	//Scrolling 
	
	public static void scrollIntoview(WebDriver driver, WebElement element)
	{
	       JavascriptExecutor js = (JavascriptExecutor)driver;
	          js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	//excelsheet
	
	public static String readDataFromExcel(int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{

		FileInputStream myfile=new FileInputStream("D:\\\\18febExcelSheet.xlsx"); 
		
			  String value = WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(rownum).getCell(cellnum).getStringCellValue();
			  
			  return value;
	}
	
	
	
	

	

}
