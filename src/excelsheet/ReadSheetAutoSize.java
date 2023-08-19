package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSheetAutoSize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{    
         FileInputStream myfile=new FileInputStream("D:\\18febExcelSheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int lastrownum = mysheet.getLastRowNum();
		
          System.out.println(lastrownum);
          
          int totalrownum=lastrownum;
          
          short lastcellnum = mysheet.getRow(0).getLastCellNum();
          System.out.println(lastcellnum);
          
          int totalcellnum=lastcellnum-1;
          
          for(int i=0; i<=totalrownum; i++) 
          {
        	  for(int j=0; j<=totalcellnum; j++) 
        	  {
        		  String value = mysheet.getRow(i).getCell(j).getStringCellValue();
        		  System.out.print(value+" ");
        	  }
        	  System.out.println();
        	  
          }
	}

}
