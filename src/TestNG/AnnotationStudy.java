package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateUserId() {
	  
	  Reporter.log("User Id Validate",true);
  }
  @Test
  public void vadlidateDashbord() {
	  
	  Reporter.log("dashbord Validate",true);
  }
  
  @BeforeMethod
  public void LoginToKiteApp() {
	  Reporter.log("login sucess",true);
	  
  }
  @BeforeClass
  public void launchBrowser() {
	  Reporter.log("browser launch",true);
  }
  
  @AfterMethod
  public void logoutFromKiteApp() {
	  Reporter.log("log out kit app ",true);
  }
  
  @AfterClass
  public void closeBroser() {
	  Reporter.log("broser closed",true);
  }
  
  
  
  
  
  
  
  
  
  
  
}
