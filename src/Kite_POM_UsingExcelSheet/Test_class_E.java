package Kite_POM_UsingExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class_E {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 File myfile = new File("F:\\Automation\\Selenium deivers\\My info.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		 
		 String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
		 String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
	

		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(1000);
		
			KiteLoginPage_E login = new KiteLoginPage_E(driver);
			login.sendUsername(UN);
			login.sendPassward(PWD);
			login.clickonLoginbutton();
			Thread.sleep(1000);
			
			KitePinPage_E pin = new KitePinPage_E(driver);
			pin.sendPin(PIN);
			pin.clickOnContinueButton();
			Thread.sleep(1000);
			
			KiteHomePage_E home = new KiteHomePage_E(driver);
			home.validateUsername(UN);
			home.logout();
			
			driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
