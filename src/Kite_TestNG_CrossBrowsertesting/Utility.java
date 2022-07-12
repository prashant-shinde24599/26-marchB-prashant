package Kite_TestNG_CrossBrowsertesting;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	
	//excel reading 
	//screnshoot
	//closing
    
	//all method is static method 
	
//	public static String DataReadExcel(int row,int cell) throws EncryptedDocumentException, IOException 
//	{
//		 File myfile = new File("F:\\Automation\\Selenium deivers\\My info.xlsx");
//		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
//		 String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
//		 return value;
//	}
//    
	//screenshot code
	
	public static void CaptureScreenshot(WebDriver driver,String TCID) throws IOException
	{
		File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Automation\\Selenium deivers\\Screenshot_use_selenium_\\My_Frist_testCase"+TCID+".png");
		FileHandler.copy(SRC, dest);
	}
	
	//property file use
	public static String GetdataFromPropertyfile(String key) throws IOException
	{
		   Properties Prop=new Properties();
		   FileInputStream myfile=new FileInputStream("C:\\Users\\Akash\\eclipse-workspace\\AKASH\\Kite_Property_file.properties");
		   Prop.load(myfile);
		   String value = Prop.getProperty(key);
           return value;
		   
	}
	
}
