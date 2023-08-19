package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{   
FileInputStream myfile=new FileInputStream("D:\\18febExcelSheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
         System.out.println(mysheet.getRow(5).getCell(0).getCellType());
         //System.out.println(mysheet.getRow(5).getCell(0).getNumericCellValue());
         System.out.println(mysheet.getRow(5).getCell(0).getStringCellValue());
	}

}
