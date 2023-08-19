package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{ 
		
		FileInputStream myfile=new FileInputStream("D:\\\\18febExcelSheet.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myfile);
		
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		
		Row myrow = mysheet.getRow(2);
		
		Cell mycell = myrow.getCell(1);
		
		CellType mycelltype = mycell.getCellType();
		
       System.out.println("data type is="+mycelltype);
       
       System.out.println(mycell.getNumericCellValue());
	}

}
