package Excel_sheet_read;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 File myfile = new File("F:\\Automation\\Selenium deivers\\My info.xlsx");
		 
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		 
		 int rowcount = mysheet.getLastRowNum();
		 System.out.println(rowcount);           //will give all  row count
         
		 short totalcell = mysheet.getRow(rowcount).getLastCellNum();
		 int cellcount = totalcell-1;
		 System.out.println(cellcount);           //will give all cell count
		 
		 System.out.println("=================================");
		 for(int i=0;i<=rowcount;i++)
		 {
			 for(int j=0;j<=cellcount;j++)
			 {
				Cell cellvalue = mysheet.getRow(i).getCell(j);
				CellType datatype = cellvalue.getCellType();
				if(datatype==CellType.STRING)
				{
					String value = cellvalue.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double value = cellvalue.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.BOOLEAN)
				{
					boolean value = cellvalue.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.print("        ");
				}
				
			 }
			 System.out.println();
		 }
		 
	}

}
