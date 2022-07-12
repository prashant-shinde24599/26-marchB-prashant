package Kite_Testing_Normal;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Using_ExelSheet {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		 
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
		
			WebElement userid = driver.findElement(By.id("userid"));
			WebElement passward = driver.findElement(By.id("password"));
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userid.sendKeys(UN);
			passward.sendKeys(PWD);
			login.click();
			
			Thread.sleep(1000);
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueBotton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys(PIN);
			continueBotton.click();
		    Thread.sleep(1000);
		    
            WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		    
		    String actualUserID = username.getText();
		    String expectedUserID = UN;
		    
		    if(actualUserID.equals(expectedUserID))
		    {
		    	System.out.println("User ID matching Tc is PASSED");
		    }
		    else
		    {
		    	System.out.println("User ID not matching Tc is FAILED");
		    }
		    
		    username.click();
		    Thread.sleep(100);
		    
		    driver.findElement(By.xpath("//a[@target='_self']")).click();
		    Thread.sleep(2000);
		    
		    driver.quit();

		   
		    
			

	}

}
