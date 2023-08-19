package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
FileInputStream myfile=new FileInputStream("D:\\18febExcelSheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int myrow = mysheet.getLastRowNum();
		int mycell = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=myrow; i++)
		{
			for(int j=0; j<=mycell; j++) 
			{
			 Cell mycelltype = mysheet.getRow(i).getCell(j);
			 CellType celltype = mycelltype.getCellType();
			 
			 if(celltype==CellType.STRING) 
			 {
				 System.out.print(mycelltype.getStringCellValue()+" ");
			 }
			 else if (celltype==CellType.NUMERIC) 
			 {
				 System.out.print(mycelltype.getNumericCellValue()+" ");
			 }
			 
			 else if (celltype==CellType.BOOLEAN) 
			 {
				 System.out.print(mycelltype.getBooleanCellValue()+" ");
			 }
			 else if (celltype==CellType.BLANK)
			 {
				 System.out.print(" ");
			 }
			}
			System.out.println();
		}

	}

}
