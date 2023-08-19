package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("D:\\18febExcelSheet.xlsx");
       
		Sheet myworkbook = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//read whole row
		for(int i=0; i<=2; i++)
		{
			String mycell = myworkbook.getRow(0).getCell(i).getStringCellValue();
			
		  System.out.print(mycell+" ");
		}	
		
		//read whole column
		
		for(int i=0; i<=3; i++)
		{
			String mycell1 = myworkbook.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(mycell1);
		}
	}

}
