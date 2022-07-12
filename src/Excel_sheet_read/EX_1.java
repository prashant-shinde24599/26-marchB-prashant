package Excel_sheet_read;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	       
		   //create object file class passing exel file path & filename extention(.xlsx)
            File myfile = new File("F:\\Automation\\Selenium deivers\\My info.xlsx");
            
            //workbookfactory class read the excel sheet
            //how to read string value
            String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
            System.out.println("Employs Name is :- "+ name);
            
            String surname = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
            System.out.println("surname :- "+surname);
            
            //how to read numric value
            double hight = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
            System.out.println("hight is :- "+ hight);
            
            double age = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
            System.out.println("age is :- "+ age);
            
            //how to read charcter value
            String bloodgroup = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
            System.out.println("bloodgroup is :- "+ bloodgroup +"+");
            
            boolean active = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
            System.out.println("active status :-" +active);
            
	}

}
