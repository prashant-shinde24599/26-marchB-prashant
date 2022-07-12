package Excel_sheet_read;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 File myfile = new File("F:\\Automation\\Selenium deivers\\My info.xlsx");
		 
		 Workbook book = WorkbookFactory.create(myfile);
		 Sheet mySheet = book.getSheet("Sheet1");
		 Row myrow = mySheet.getRow(0);
		 Cell mycell = myrow.getCell(0);
		 System.out.println(mycell.getCellType());
		 System.out.println("++++++++++++++++++++++++++++++++++++++++");
		 
		 //code for reading all data to excel sheet in same datatype
		Sheet mysheet1 = book.getSheet("Sheet3");
		 for(int i=0;i<=1;i++)
		 {
			 for(int j=0;j<=2;j++)
			 {
				String value = mysheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			 }
			 System.out.println();
		 }
			
		 

	}

}
