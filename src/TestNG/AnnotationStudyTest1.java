package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudyTest1 {
  @Test
  public void rechargePhone() {
	  
	  Reporter.log("recharge done",true);
  }
  
  @BeforeMethod
  public void loginToRechargePortal() {
	  Reporter.log("login sucess",true);
  }

  @AfterMethod
  public void logOutToRechargepostal() {
	  Reporter.log("logut sucess",true);
  }

  @BeforeClass
  public void launchBroser() {
	  Reporter.log("broser launch",true);
  }

  @AfterClass
  public void closeBroser() {
	  Reporter.log("browser closed",true);
  }

}
