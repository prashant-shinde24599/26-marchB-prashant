package POM_DDF_TestNG_BaseClass_UtilityClass_Screenshot;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Kite_Only_Base.Base;
import Kite_Only_POM.KiteHomePage_E;
import Kite_Only_POM.KiteLoginPage_E;
import Kite_Only_POM.KitePinPage_E;
import Kite_Only_Utility.Utility;

public class Validate_kite_UserId extends Base {
	
	
	KiteLoginPage_E login;
	KitePinPage_E pin;
	KiteHomePage_E home;
	String TCID="1234";
	@BeforeClass
	public void LaunchBrowser()
	{
		Openbrowser();
		login=new KiteLoginPage_E(driver);
		pin= new KitePinPage_E(driver);
		home=new KiteHomePage_E(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteapp() throws EncryptedDocumentException, IOException
	{
		login.sendUsername(Utility.DataReadExcel(0, 0));
		login.sendPassward(Utility.DataReadExcel(0, 1));
		login.clickonLoginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.DataReadExcel(0, 2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
    @Test
    public void validateUsername() throws EncryptedDocumentException, IOException 
    {
 	  Assert.assertEquals(home.getactualusername(), Utility.DataReadExcel(0, 0),"actual & extepcted not maching Tc is failed ");
 	  Reporter.log("actual & expected maching Tc is passed",true);
 	  
 	  POM_DDF_TestNG_BaseClass_UtilityClass_Screenshot.Utility.CaptureScreenshot(driver, TCID);
 	
    }
    
    @AfterMethod
    public void logoutKiteapp() throws InterruptedException
    {
    	home.logout();
    	
    }
    
    @AfterClass
    public void closeBrowser()
    {
    	driver.close();
    }
}
