package ChromeOption_use;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chrome_Option {
	
	WebDriver driver;
	Sheet mysheet;
	KiteLoginPage_E Login;
	KitePinPage_E Pin;
	KiteHomePage_E Home;
	
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
	  
	  //****create object of Chromeoption classs
	  
	  ChromeOptions opt=new ChromeOptions();
	    // *by using headless browser
	    //opt.addArguments("--headless"); 
	  
	    //*by using disbale notificatiom
	    //opt.addArguments("--disable-notifications");
	    
	    //*by using incognito mode
	    opt.addArguments("incognito");
	    
	   
	    driver=new ChromeDriver(opt);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	    File myfile = new File("F:\\Automation\\Selenium deivers\\My info.xlsx");
	    mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
	  	
	    Login = new KiteLoginPage_E(driver);
	    Pin = new KitePinPage_E(driver);
	    Home = new KiteHomePage_E(driver);
	    
  }
  @BeforeMethod
  public void loginKiteapp() {
	  
	    String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = mysheet.getRow(0).getCell(2).getStringCellValue();
	    
		Login.sendUsername(UN);
		Login.sendPassward(PWD);
		Login.clickonLoginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Pin.sendPin(PIN);
		Pin.clickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
  }
  
  @Test
  public void ValidateUsername() {
	  
	    String expectedUN = mysheet.getRow(0).getCell(0).getStringCellValue();
	    String actualUN = Home.getactualusername();
	    Assert.assertEquals(actualUN, expectedUN,"acutal & expected are not macthing TC Is failed");
	    Reporter.log("actual & expected are macthing Tc is passed",true);
  }
  
  @AfterMethod
  public void logoutkiteapp() throws InterruptedException {
	  
	    Home.logout();
  }
  
  @AfterClass
  public void CloseBroser() throws InterruptedException {
	  
	    Thread.sleep(1000);
	    driver.close();
  }
}
