package Kite_Only_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	
	//excel reading 
	//screnshoot
	//closing
    
	//all method is static method 
	
	public static String DataReadExcel(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		 File myfile = new File("F:\\Automation\\Selenium deivers\\My info.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		 String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		 return value;
	}
    
	
	
}
