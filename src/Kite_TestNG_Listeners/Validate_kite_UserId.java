package Kite_TestNG_Listeners;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import Kite_Only_Base.Base;
import Kite_Only_POM.KiteHomePage_E;
import Kite_Only_POM.KiteLoginPage_E;
import Kite_Only_POM.KitePinPage_E;

@Listeners(Listener.class)
public class Validate_kite_UserId extends Kite_TestNG_Listeners.Base {
	
	
	KiteLoginPage_E login;
	KitePinPage_E pin;
	KiteHomePage_E home;
	String TCID="12345";
	
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		Openbrowser();
		login=new KiteLoginPage_E(driver);
		pin= new KitePinPage_E(driver);
		home=new KiteHomePage_E(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteapp() throws EncryptedDocumentException, IOException
	{
		login.sendUsername(Property_file_use.Utility.GetdataFromPropertyfile("UN"));
		login.sendPassward(Property_file_use.Utility.GetdataFromPropertyfile("PWD"));
		login.clickonLoginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Property_file_use.Utility.GetdataFromPropertyfile("PIN"));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
    @Test
    public void validateUsername() throws EncryptedDocumentException, IOException 
    {
 	  Assert.assertEquals(home.getactualusername(), Property_file_use.Utility.GetdataFromPropertyfile("UN"));
 	  Reporter.log("actual & expected maching Tc is passed",true);
 	  Assert.fail();
 	  
 	 Kite_TestNG_Listeners.Base.CaptureScreenshot(TCID);
 	
 	  
 	  
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
